package ua.com.kisit.unit6._protected;

public class RobotExt extends RobotProtectedVar {

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
        robotExt.x = 0;
        robotExt.y = 0;
        robotExt.distance = 300;
        robotExt.course = 200;

        System.out.println(robotExt.x + ", " + robotExt.y);

    }

}
