package ua.com.kisit.unit7;

import java.util.ArrayList;

public class RobotManager {

    public static void main(String[] args) {

        Robot robot = new Robot();
        // robot.x = 10;
        robot.setX(10);
        robot.setX(20);

        System.out.println(robot.getX());

        robot.setY(10);
        robot.setCourse(45);
        robot.setDistance(100);
        System.out.println(robot);


        RobotExt robotExt = new RobotExt();
        robotExt.setX(0);
        robotExt.setY(0);
        robotExt.setCourse(90);
        robotExt.setDistance(100);
        robotExt.forward();
        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(100);
        robotExt.forward();
        System.out.println(robotExt);

        for (RobotLine el : robotExt.getRobotLineList()){
            System.out.println(el);
        }


        RobotExt robotExt2 = new RobotExt(100,200,40,90);
        System.out.println(robotExt2);

    }

}
