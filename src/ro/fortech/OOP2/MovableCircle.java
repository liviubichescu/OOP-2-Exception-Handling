package ro.fortech.OOP2;

import ro.fortech.OOP2.exceptions.MovableException;
import ro.fortech.OOP2.exceptions.MovablePointException;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) throws MovableException {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public void moveUp() {
        center.y -= center.y;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public void moveUp(int howMuch) {

    }

    @Override
    public void moveDown(int howMuch) {

    }

    @Override
    public void moveLeft(int howMuch) {

    }

    @Override
    public void moveRight(int howMuch) {

    }

    @Override
    public String toString() {
        return String.format("MovableCircle at point %1$s with radius = %2$d" , center.toString(), radius);
    }
}
