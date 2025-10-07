package ua.com.kisit.unit6._protected;

public class Main {

    public static void main(String[] args) {

        RobotProtectedVar robotProtectedVar = new RobotProtectedVar();
        robotProtectedVar.course = 200;
        System.out.println(robotProtectedVar);
        robotProtectedVar.distance = 300;
        System.out.println(robotProtectedVar);


    }

}
