package algeescape;

public class MainFrame extends javax.swing.JFrame{
    private final static int FrameHeight = 500;
    private final static int FrameWidth = 800;

    MainPanel panel;
    
    public static int getFrameHeight() {
        return FrameHeight;
    }

    public static int getFrameWidth() {
        return FrameWidth;
    }

    public MainFrame() {
        setSize(FrameWidth, FrameHeight);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        panel = new MainPanel();
        add(panel);
        pack();
    }
}
