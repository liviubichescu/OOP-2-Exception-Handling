package ro.fortech.OOP2;

import ro.fortech.OOP2.exceptions.*;

/**
 * In clasa {@code MovablePoint} am aruncat exceptie la creerea unui punct in plan
 * daca dupa initializare nu am fi putut sa efectuam o miscare in orice directie(moveUp,moveDown,moveLeft,moveRight). Eu asa am inteles de la dvs.
 * <p>
 * In clasa {@code MovableCircle} am facut o verificare care ne spune in ce directie un cerc se poate misca dupa initializare
 * (pentru ca am inteles de la colegi ca de fapt doriti doar o verificare si nu o exceptie)
 */

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    /**
     * Constructor that initialises values of a coordonate(x and y) point
     * in a plan, moving speed(xSpeed,ySpeed) of the point and creates a circle around the point with the radius given.
     *
     * @param x      coordinate x of the center point of the circle
     * @param y      coordinate y of the center point of the circle
     * @param xSpeed moving speed of circle
     * @param ySpeed moving speed of circle
     * @param radius radius of circle
     * @throws InvalidCreationOfPointInPlanException exception is thrown if the values of X and Y parameters are not valid
     * @throws InvalidSpeedMovementException         exception is thrown if the values of xSpeed and ySpeed parameters are not valid
     * @throws InvalidCreationOfCircleException      exception is thrown if the value of radius parameter is not valid
     */
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) throws MovableException {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

        // condition to check that the radius is grather than 0
        if (radius <= 0) {
            throw new InvalidValueException("The radius must be between greater than 0 !!!");
        }

        // to avoid code duplication i decided to call the setRadius method in constructor
        // although i believe that calling a method from a constructor is a recipe for hard to understand code.
        setRadius(radius);

        //display options of circle movement
        anunt();
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) throws InvalidValueException, InvalidCreationOfCircleException {
        if (radius <= 0) {
            throw new InvalidValueException("The radius must be between greater than 0 !!!");
        }
        // temporary variable for radius
        int tempRadius = radius;
        // check if x has a negative value, change the tempRadius variable value to negative
        if (this.center.getX() < 0) {
            tempRadius *= -1;
            // check if y has a negative value
        } else if (this.center.getY() < 0) {
            // check if tempRadius value has not been changed by the previous condition
            if (tempRadius > 0) {
                // change tempRadius value to negative
                tempRadius *= -1;
            }
        }

        // condition to check if circle around a point is in plan
        if (((this.center.getX() + tempRadius) > PLAIN_X_MAX || (this.center.getX() + tempRadius) < PLAIN_X_MIN) ||
                ((this.center.getY() + tempRadius) > PLAIN_Y_MAX || (this.center.getY() + tempRadius) < PLAIN_Y_MIN)) {

            throw new InvalidCreationOfCircleException("The circle around point could not be created!");

        }
        this.radius = radius;

    }


    @Override
    public void moveUp() throws MoveUpException {
        if ((this.center.getY() + this.radius + this.center.getySpeed()) > PLAIN_Y_MAX) {
            throw new MoveUpException("Moving up could not be done! Circle out of plan !!!");
        }
        this.center.moveUp();
    }

    @Override
    public void moveDown() throws MoveDownException {
        if (this.center.getY() - (radius + this.center.getySpeed()) < PLAIN_Y_MIN) {
            throw new MoveDownException("Moving down could not be done! Circle out of plan !!!");
        }
        this.center.moveDown();
    }

    @Override
    public void moveRight() throws MoveRightException {
        if ((this.center.getX() + this.radius + this.center.getxSpeed()) > PLAIN_X_MAX) {
            throw new MoveRightException("Moving right could not be done! Circle out of plan !!!");
        }
        this.center.moveRight();
    }

    @Override
    public void moveLeft() throws MoveLeftException {
        if (this.center.getX() - (this.radius + this.center.getxSpeed()) < PLAIN_X_MIN) {
            throw new MoveLeftException("Moving down could not be done! Circle out of plan !!!");
        }
        this.center.moveLeft();
    }


    @Override
    public void moveUp(int howMuch) throws MoveUpException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value for movement!");
        }
        if ((this.center.getY() + this.radius + howMuch) > PLAIN_Y_MAX) {
            throw new MoveUpException("Moving up could not be done! Circle out of plan !!!");
        }
        this.center.moveUp(howMuch);
    }

    @Override
    public void moveDown(int howMuch) throws MoveDownException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value for movement!");
        }
        if (this.center.getY() - (radius + howMuch) < PLAIN_Y_MIN) {
            throw new MoveDownException("Moving down could not be done! Circle out of plan !!!");
        }
        this.center.moveDown(howMuch);
    }

    @Override
    public void moveLeft(int howMuch) throws MoveLeftException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value for movement!");
        }
        if (this.center.getX() - (this.radius + howMuch) < PLAIN_X_MIN) {
            throw new MoveLeftException("Moving left could not be done! Circle out of plan !!!");
        }
        this.center.moveLeft(howMuch);
    }

    @Override
    public void moveRight(int howMuch) throws MoveRightException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value for movement!");
        }
        if ((this.center.getX() + this.radius + howMuch) > PLAIN_X_MAX) {
            throw new MoveRightException("Moving right could not be done! Circle out of plan !!!");
        }
        this.center.moveRight(howMuch);

    }

    @Override
    public String toString() {
        return String.format("MovableCircle with center at %1$s with radius = %2$d", this.center.toString(), this.radius);
    }

    /**
     * Method that check in what direction a point can move and displays the options
     */
    public void anunt() {

        System.out.println("You can move the circle: ");

        if ((this.center.getY() + this.radius + this.center.getySpeed()) <= PLAIN_Y_MAX) {
            System.out.println("UP ");
        }
        if (this.center.getY() - (radius + this.center.getySpeed()) >= PLAIN_Y_MIN) {
            System.out.println("DOWN ");
        }
        if ((this.center.getX() + this.radius + this.center.getxSpeed()) <= PLAIN_X_MAX) {
            System.out.println("RIGHT ");
        }
        if (this.center.getX() - (this.radius + this.center.getxSpeed()) >= PLAIN_X_MIN) {
            System.out.println("LEFT ");
        }
    }
}
