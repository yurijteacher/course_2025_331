package ua.com.kisit.unit9.generalization;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    protected double x = 0;
    protected double y = 0;
    private double course = 0;
    private double distance = 0;

    private List<RobotLine> robotLineList = new ArrayList<>();

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }

    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }

    public void forward() {
        double templX = x;
        double templY = y;

        x += distance * cos(toRadians(course));
        y += distance * sin(course * PI/180);

        // v.1 contr
//        RobotLine robotLine = new RobotLine(templX, templY, x, y);
//        robotLineList.add(robotLine);
        // v.2 set
//        RobotLine robotLine = new RobotLine();
//        robotLine.setOldX(templX);
//        robotLine.setOldY(templY);
//        robotLine.setNewX(x);
//        robotLine.setNewY(y);
//        robotLineList.add(robotLine);
        // v3.
        robotLineList.add(new RobotLine(templX, templY, x, y));
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public Robot(double distance, double course){
//        this.distance = distance;
//        this.course = course;
//    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    public static void main(String[] args) {

        Robot robot = new Robot();

        Robot robot1 = new Robot(1);
        Robot robot2 = new Robot(2,1);
        Robot robot3 = new Robot(3,2,45);
        Robot robot4 = new Robot(4,3,45,100);

        System.out.println(robot);
        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);

        Robot robot5 = new Robot(0,0,90, 100);
        System.out.println(robot5);
        robot5.forward();
        System.out.println(robot5);

        robot5.setCourse(90);
        robot5.distance = 200;

        robot5.forward();
        System.out.println(robot5);

    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
