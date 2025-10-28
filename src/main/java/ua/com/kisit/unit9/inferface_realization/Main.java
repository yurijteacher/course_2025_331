package ua.com.kisit.unit9.inferface_realization;

public class Main {

    public static void main(String[] args) {

        Calc calculation = new Calc();

        System.out.println(calculation.add(5, 6));

        System.out.println(calculation.div(10, 2));

        System.out.println(Calculation.mul(5, 6));


        // RobotBase robotBase = new RobotBase();

        Robot robot = new Robot();
        robot.forward();

    }

}
