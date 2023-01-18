package org.example.control;

import org.example.model.Robot;

public class RobotController {


    private Robot robot;

    public RobotController(Robot robot){
        this.robot = robot;
    }

    public RobotController(){
        this.robot = new Robot();
    }

    public Robot getRobot() {
        return robot;
    }

    public void go(){
        switch (robot.getWorldSide()){
            case East:
                robot.setX(robot.getX()+1);
                break;
            case West:
                robot.setX(robot.getX()-1);break;
            case North:
                robot.setY(robot.getY()+1);break;
            case South:
                robot.setY(robot.getY()-1);break;
        }
    }

    public void rotateLeft(){
        robot.setWorldSide(robot.getWorldSide().rotateLeft());
    }

    public void rotateRight(){
        robot.setWorldSide(robot.getWorldSide().rotateRight());
    }
}
