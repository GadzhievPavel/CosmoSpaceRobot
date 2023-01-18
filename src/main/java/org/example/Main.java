package org.example;

import org.example.control.RobotController;

public class Main {
    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        System.out.println(robotController.getRobot().toString());
        robotController.go();
        System.out.println(robotController.getRobot().toString());
        robotController.rotateLeft();
        System.out.println(robotController.getRobot().toString());
        robotController.rotateRight();
        System.out.println(robotController.getRobot().toString());
    }
}