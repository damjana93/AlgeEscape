package algeescape;

public class Switch {
    private int switchHeight = 50;
    private int switchWidth = 30;
    private int switchX;
    private int switchY;
    private boolean swichOn = false;

    public void setSwitchHeight(int switchHeight) {
        this.switchHeight = switchHeight;
    }

    public void setSwitchWidth(int switchWidth) {
        this.switchWidth = switchWidth;
    }

    public void setSwitchX(int switchX) {
        this.switchX = switchX;
    }

    public void setSwitchY(int switchY) {
        this.switchY = switchY;
    }

    public int getHeight() {
        return switchHeight;
    }

    public int getWidth() {
        return switchWidth;
    }

    public int getX() {
        return switchX;
    }

    public int getY() {
        return switchY;
    }
    
    public Switch(int switchX) {
        this.switchX = switchX;
        this.switchY = MainPanel.PanelHeight - switchHeight;
    }
    
    public void SwitchAction()
    {
        swichOn = !swichOn;
    }
}
