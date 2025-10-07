package ua.com.kisit.unit6;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 90;
    private double distance = 100;

    public static void main(String[] args) {
        Robot robot;
        robot = new Robot();

        System.out.println(robot.toString());

        // robot = new Robot(1,1,1,2);
        System.out.println(robot.toString());
        robot.x = 10;
        robot.y = 10;
        robot.course = 95;
        robot.distance = 101;
        System.out.println(robot);
    }

    @Override
    public String toString() {
        return "x=" + x + ", y="
                + y + ", course="
                + course + ", distance="
                + distance;
    }


    public Robot() {}

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

}
