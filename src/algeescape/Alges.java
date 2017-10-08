package algeescape;

public class Alges {
    private int algesHeight = 50;
    private int algesWidth = 30;
    private int algesX;
    private int algesY;
    
    public int getHeight() {
        return algesHeight;
    }

    public int getWidth() {
        return algesWidth;
    }

    public int getX() {
        return algesX;
    }

    public int getY() {
        return algesY;
    }

    public Alges(int algesX) {
        this.algesX = algesX;
        this.algesY = MainPanel.PanelHeight - algesHeight;
    }
    
    public void move(int UpDown, int LeftRight)
    {
        algesX += LeftRight*MainPanel.gameSpeed;
        algesY += UpDown * MainPanel.gameSpeed;
    }
}
