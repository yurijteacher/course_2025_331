package ua.com.kisit.unit7;

public class RobotLine {

    private double oldX;
    private double oldY;

    private double newX;
    private double newY;

    public RobotLine() {}

    public RobotLine(double oldX, double oldY, double newX, double newY) {
        this.oldX = oldX;
        this.oldY = oldY;
        this.newX = newX;
        this.newY = newY;
    }

    public double getOldX() {
        return oldX;
    }

    public void setOldX(double oldX) {
        this.oldX = oldX;
    }

    public double getOldY() {
        return oldY;
    }

    public void setOldY(double oldY) {
        this.oldY = oldY;
    }

    public double getNewX() {
        return newX;
    }

    public void setNewX(double newX) {
        this.newX = newX;
    }

    public double getNewY() {
        return newY;
    }

    public void setNewY(double newY) {
        this.newY = newY;
    }

    @Override
    public String toString() {
        return "RobotLine{" +
                "oldX=" + oldX +
                ", oldY=" + oldY +
                ", newX=" + newX +
                ", newY=" + newY +
                '}';
    }
}
