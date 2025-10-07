package ua.com.kisit.unit6.manager_robot;

import ua.com.kisit.unit6._default.RobotDefaultVar;
import ua.com.kisit.unit6._private.RobotPrivateVar;
import ua.com.kisit.unit6._protected.RobotProtectedVar;
import ua.com.kisit.unit6._public.RobotPublicVar;

public class Main {

    public static void main(String[] args) {
        RobotDefaultVar robotDefaultVar = new RobotDefaultVar();
//        robotDefaultVar.x = 0;
//        robotDefaultVar.y = 0;

        RobotPrivateVar robotPrivateVar = new RobotPrivateVar();
//        robotPrivateVar.x = 0;

        RobotPublicVar robotPublicVar = new RobotPublicVar();
        robotPublicVar.x = 16;
        robotPublicVar.y = 16;
        robotPublicVar.course = 100;
        robotPublicVar.distance = 200;

        System.out.println(robotPublicVar);

        RobotProtectedVar robotProtectedVar = new RobotProtectedVar();
//        System.out.println(robotProtectedVar.x);

    }
}
