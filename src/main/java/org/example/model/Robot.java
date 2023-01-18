package org.example.model;

public class Robot {
    private int x;
    private int y;
    private WorldSide worldSide;
    public Robot(){
        setX(0);
        setY(0);
        setWorldSide(WorldSide.North);
    }

    public Robot(int x, int y, WorldSide worldSide){
        setY(y);
        setX(x);
        setWorldSide(worldSide);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public WorldSide getWorldSide() {
        return worldSide;
    }

    public void setWorldSide(WorldSide worldSide) {
        this.worldSide = worldSide;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", worldSide=" + worldSide +
                '}';
    }
}
