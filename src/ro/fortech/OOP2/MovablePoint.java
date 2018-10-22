package ro.fortech.OOP2;

import ro.fortech.OOP2.exceptions.MovableDimensionException;
import ro.fortech.OOP2.exceptions.MovablePointException;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    /**
     * Constructor that initialises values of a coordonate(x and y) point
     * in a plan and moving speed(xSpeed,ySpeed) of the same coordonate.
     *
     * @param x      x coordonate point in plan
     * @param y      y coordonate point in plan
     * @param xSpeed moving speed of x
     * @param ySpeed moving speed of y
     * @throws MovablePointException exception is thrown if the values of the parameter are not valid
     */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws MovableDimensionException {
        if ((x > PLAIN_X_MAX || x < PLAIN_X_MIN) || (y > PLAIN_Y_MAX || y < PLAIN_Y_MIN)) {
            throw new MovableDimensionException("The coordonate of the movable point must be: [ X between " + PLAIN_X_MAX + " and " + PLAIN_X_MIN +
                    " ] and [ Y between " + PLAIN_Y_MAX + " and " + PLAIN_Y_MIN + " ]");
        }
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() throws MovablePointException {
        x += xSpeed;
    }

    @Override
    public void moveDown() throws MovablePointException {
        if (xSpeed > 0){
            throw new MovablePointException("The movement of point could not be compleated! Number of points must be a negative number!!!");
        }
        x = x - xSpeed;
    }

    @Override
    public void moveLeft() {
        y = y - ySpeed;
    }

    @Override
    public void moveRight() {
        y = y + ySpeed;
    }

    @Override
    public void moveUp(int howMuch) throws MovablePointException {
        int edge = x + howMuch;
        if (edge > PLAIN_X_MAX){
            throw new MovablePointException("The move could not be compleated! Number of points for the upper movement is to big!!!");
        }
        if (howMuch < 0){
            throw new MovablePointException("The move could not be compleated! Number of points must be a positive number!!!");
        }

        x += howMuch;
    }

    @Override
    public void moveDown(int howMuch) throws MovablePointException {
        if (howMuch > 0){
            throw new MovablePointException("The movement of point could not be compleated! Number of points must be a negative number!!!");
        }
        x = x - (-howMuch);
    }

    @Override
    public void moveLeft(int howMuch) {
        y = y - (-howMuch);
    }

    @Override
    public void moveRight(int howMuch) {
        y = y + howMuch;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint (%1$d, %2$d) with xSpeed = %3$d and ySpeed = %4$d", x, y, xSpeed, ySpeed);
    }
}
