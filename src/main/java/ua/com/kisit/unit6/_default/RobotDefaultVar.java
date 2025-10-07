package ua.com.kisit.unit6._default;

public class RobotDefaultVar {

    double x = 0;
    double y = 0;
    double course = 90;
    double distance = 0;

    public static void main(String[] args) {

        RobotDefaultVar robotDefaultVar = new RobotDefaultVar();
        robotDefaultVar.x = robotDefaultVar.y = robotDefaultVar.course = robotDefaultVar.distance = 5;

        System.out.println(robotDefaultVar.x);
    }


}
