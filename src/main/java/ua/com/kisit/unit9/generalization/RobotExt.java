package ua.com.kisit.unit9.generalization;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    public RobotExt(){}

    public RobotExt(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();

        robotExt.setCourse(0);
        robotExt.setDistance(0);
        robotExt.setY(0);
        robotExt.setX(0);

        robotExt.forward();
        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(100);
        robotExt.forward();
        System.out.println(robotExt);


        robotExt.x = 100;
        robotExt.y = 100;
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += getDistance();
    }

    @Override
    public String toString(){
        return super.toString() + ", totalDistance=" + totalDistance;
    }



}
