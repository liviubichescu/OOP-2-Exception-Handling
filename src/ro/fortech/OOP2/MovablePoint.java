package ro.fortech.OOP2;

import ro.fortech.OOP2.exceptions.*;

public class MovablePoint implements Movable {

    // package accesible fields
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    /**
     * Constructor that initialises values of a coordonate(x and y) point
     * in a plan and moving speed(xSpeed,ySpeed) of the same coordonate.
     *
     * @param x      coordinate x of point in plan
     * @param y      coordinate y of point in plan
     * @param xSpeed moving speed of x
     * @param ySpeed moving speed of y
     * @throws InvalidCreationOfPointInPlanException exception is thrown if the values of X and Y parameters are not in plan
     * @throws InvalidSpeedMovementException exception is thrown if the values of xSpeed and ySpeed parameters are not valid
     * @throws InvalidValueException exception is thrown if the values of xSpeed and ySpeed parameters are less or equal to 0
     */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws InvalidCreationOfPointInPlanException, InvalidSpeedMovementException, InvalidValueException {
        // condition to check that parameters X and Y are in plan
        if ((x > PLAIN_X_MAX || x < PLAIN_X_MIN) || (y > PLAIN_Y_MAX || y < PLAIN_Y_MIN)) {
            throw new InvalidCreationOfPointInPlanException("The coordinate X and Y of the movable point must be between: " + PLAIN_X_MAX + " and " + PLAIN_X_MIN );
        }
        // condition to check that the speed movement is a positive number
        if (xSpeed <= 0 || ySpeed <= 0) {
            throw new InvalidValueException("The speed movement of X and Y must be between greater than 0 !!!");
        }
        // ---aici eu am inteles ca doriti ca la creerea unui punct in plan sa ne asiguram ca putem sa efectuam o miscare in orice directie---
        // condition to check that a point can move in any direction, with one unit of speed, after it's been created
        if ((PLAIN_X_MAX < (xSpeed + Math.abs(x))) || (Math.abs(PLAIN_X_MIN) < (xSpeed + Math.abs(x)))) {
            throw new InvalidSpeedMovementException("The speed movement of X is incorect!!!");
        }
        if ((PLAIN_Y_MAX < (ySpeed+ Math.abs(y))) || (Math.abs(PLAIN_Y_MIN) < (ySpeed + Math.abs(y)))) {
            throw new InvalidSpeedMovementException("The speed movement of Y is incorect!!!");
        }

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(int xSpeed) throws InvalidValueException {
        if (xSpeed <= 0) {
            throw new InvalidValueException("The speed movement of X must be greater than 0 !!!");
        }
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(int ySpeed) throws InvalidValueException {
        if (ySpeed <= 0) {
            throw new InvalidValueException("The speed movement of Y must be greater than 0 !!!");
        }
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() throws MoveUpException {
        int tempX = this.y + this.ySpeed;
        if (tempX > PLAIN_Y_MAX){
            throw new MoveUpException("Moving up could not be done! Maximum value for Y is "+PLAIN_Y_MAX);
        }
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() throws MoveDownException {
        int tempX = this.y - this.ySpeed;
        if (tempX < PLAIN_Y_MIN){
            throw new MoveDownException("Moving down could not be done! Minimum value for Y is " +PLAIN_Y_MIN);
        }
        this.y -= this.ySpeed;
    }

    @Override
    public void moveRight() throws MoveRightException {
        int tempX = this.x + this.xSpeed;
        if (tempX > PLAIN_X_MAX){
            throw new MoveRightException("Moving right could not be done! Maximum value for X is "+PLAIN_X_MAX);
        }
        this.x += this.xSpeed;
    }

    @Override
    public void moveLeft() throws MoveLeftException {
        int tempX = this.x - this.xSpeed;
        if (tempX < PLAIN_X_MIN){
            throw new MoveLeftException("Moving left could not be done! Minimum value for X is " +PLAIN_X_MIN);
        }
        this.x -= this.xSpeed;
    }


    @Override
    public void moveUp(int howMuch) throws MoveUpException, InvalidValueException {
        if (howMuch <= 0){
            throw new InvalidValueException("Invalid value for movement!");
        }
        int temp = this.y + howMuch;
        if (temp > PLAIN_Y_MAX){
            throw new MoveUpException("The move could not be compleated! Number of points for the upper movement in the plain is to big!!!");
        }

        this.y += howMuch;


    }

    @Override
    public void moveDown(int howMuch) throws MoveDownException, InvalidValueException {
        if (howMuch <= 0){
            throw new InvalidValueException("Invalid value for movement!");
        }
        int temp = y - howMuch;
        if (temp < PLAIN_Y_MIN){
            throw new MoveDownException("The move could not be compleated! Number of points for down movement in the plain is to big!!!");
        }
        y -= howMuch;
    }

    @Override
    public void moveRight(int howMuch) throws MoveRightException, InvalidValueException {
        if (howMuch <= 0){
            throw new InvalidValueException("Invalid value for movement!");
        }
        int temp = this.x + howMuch;
        if (temp > PLAIN_X_MAX){
            throw new MoveRightException("The move could not be compleated! Number of points for the right movement in the plain is to big!!!");
        }
        this.x += howMuch;
    }

    @Override
    public void moveLeft(int howMuch) throws MoveLeftException, InvalidValueException {
        if (howMuch <= 0){
            throw new InvalidValueException("Invalid value for movement!");
        }
        int temp = this.x - howMuch;
        if (temp < PLAIN_X_MIN){
            throw new MoveLeftException("The move could not be compleated! Number of points for the left movement in the plain is to big!!!");
        }
        this.x -= howMuch;

    }


    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
