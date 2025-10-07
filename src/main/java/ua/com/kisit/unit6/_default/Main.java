package ua.com.kisit.unit6._default;

public class Main {

    public static void main(String[] args) {

        RobotDefaultVar robotDefaultVar = new RobotDefaultVar();
        robotDefaultVar.x = robotDefaultVar.y = robotDefaultVar.course = robotDefaultVar.distance = 5;

        robotDefaultVar.x = 1011;

        System.out.println(robotDefaultVar.x);

    }

}
