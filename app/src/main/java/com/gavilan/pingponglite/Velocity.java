package com.gavilan.pingponglite;

public class Velocity {
    private int x;
    private int y;

    public Velocity() {
        this(1, 1);
    }

    public Velocity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
