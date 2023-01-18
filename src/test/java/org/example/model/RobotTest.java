package org.example.model;

import org.example.control.RobotController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void getX() {
        Robot robot = new Robot();
        assertEquals(robot.getX(),0);
    }

    @Test
    void setX() {
        Robot robot = new Robot();
        robot.setY(5);
        assertEquals(robot.getY(),5);
    }

    @Test
    void getY() {
        Robot robot = new Robot(0, 8, WorldSide.East);
        RobotController controller = new RobotController(robot);
        controller.go();
        assertEquals(robot.getY(),8);
    }

    @Test
    void setY() {
        Robot robot = new Robot();
        robot.setY(4);
        assertEquals(robot.getY(),4);
    }

    @Test
    void getWorldSide() {
        Robot robot = new Robot(4,9,WorldSide.South);
        assertEquals(robot.getWorldSide(),WorldSide.South);
    }

    @Test
    void setWorldSide() {
        Robot robot = new Robot();
        robot.setWorldSide(WorldSide.West);
        assertEquals(robot.getWorldSide(),WorldSide.West);
    }
}