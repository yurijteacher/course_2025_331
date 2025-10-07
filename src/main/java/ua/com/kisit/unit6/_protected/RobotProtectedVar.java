package ua.com.kisit.unit6._protected;

public class RobotProtectedVar {

    protected double x = 0;
    protected double y = 0;
    protected double course = 90;
    protected double distance = 0;

    public static void main(String[] args) {

        RobotProtectedVar robotProtectedVar = new RobotProtectedVar();
        robotProtectedVar.distance = 200;
        System.out.println(robotProtectedVar);
        robotProtectedVar.x = 200;
        System.out.println(robotProtectedVar);
        robotProtectedVar.y = 200;
        System.out.println(robotProtectedVar);
        robotProtectedVar.course = 200;
        System.out.println(robotProtectedVar);

    }
}
