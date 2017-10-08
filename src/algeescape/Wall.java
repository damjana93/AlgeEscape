package algeescape;

public class Wall {
    private int wallHeight = MainFrame.getFrameHeight();
    private int wallWidth = 20;
    private int wallX;

    public void setWallX(int X) {
        this.wallX = X;
    }

    public int getHeight() {
        return wallHeight;
    }

    public int getWidth() {
        return wallWidth;
    }

    public int getX() {
        return wallX;
    }
    
    

    public Wall(int X) {
        wallX = X;
    }
    
}
