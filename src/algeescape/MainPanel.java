package algeescape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class MainPanel extends javax.swing.JPanel {
    public final static int PanelHeight = MainFrame.getFrameHeight()-20;
    public final static int PanelWidth = MainFrame.getFrameWidth();
    public static final int gameSpeed = 3;
    private ArrayList<Alges> alges;
    private ArrayList<Switch> switches;
    private ArrayList<Wall> wall;
    private Random randomizer = new Random();
    private int focusedAlgeIndex;
    
    public MainPanel() {
        setPreferredSize(new Dimension(PanelWidth, PanelHeight));
        setLayout(null);
        setBackground(Color.WHITE);
        setFocusable(true);
        setVisible(true);
        alges = new  ArrayList<>();
        switches =new  ArrayList<>();
        wall = new  ArrayList<>();
        StartGame();
    }
    
    public void StartGame(){
        alges.clear();
        wall.clear();
        switches.clear();
        
        alges.add(new Alges(PanelWidth/2));
        int swichX = randomizer.nextInt(PanelWidth/2 - 70) + PanelWidth/2 + 70;
        switches.add(new Switch(swichX));
        int wallX = randomizer.nextInt(PanelWidth - swichX) + swichX;
        wall.add(new Wall(wallX));
        focusedAlgeIndex = 0;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.red);
        for(int i = 0; i < alges.size(); i++)
            g.fillRect(alges.get(i).getX(), alges.get(i).getY(), 
                    alges.get(i).getWidth(), alges.get(i).getHeight());
        
        g.setColor(Color.BLUE);
        for(int i = 0; i < switches.size(); i++)
            g.drawRect(switches.get(i).getX(), switches.get(i).getY(), 
                    switches.get(i).getWidth(), switches.get(i).getHeight());
        
        
        g.setColor(Color.GREEN);
        for(int i = 0; i < wall.size(); i++)
            g.fillRect(wall.get(i).getX(), 0, 
                    wall.get(i).getWidth(), wall.get(i).getHeight());
    }
    
    
}
