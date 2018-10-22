package ro.fortech.OOP2;

import ro.fortech.OOP2.exceptions.MovablePointException;

public interface Movable {

    int PLAIN_X_MAX = 1000;
    int PLAIN_Y_MAX = 1000;
    int PLAIN_X_MIN = -1000;
    int PLAIN_Y_MIN = -1000;


    /**
     * Moves the form up in the plain.
     * The movement is one unit of speed.
     */
    void moveUp() throws MovablePointException;

    /**
     * Moves the form down in the plain.
     * The movement is one unit of speed.
     */
    void moveDown() throws MovablePointException;

    /**
     * Moves the form left in the plain.
     * The movement is one unit of speed.
     */
    void moveLeft();

    /**
     * Moves the form right in the plain.
     * The movement is one unit of speed.
     */
    void moveRight();

    /**
     * Moves the form up in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move up in the plain
     */
    void moveUp(int howMuch) throws MovablePointException;

    /**
     * Moves the form down in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move down in the plain
     */
    void moveDown(int howMuch) throws MovablePointException;

    /**
     * Moves the form left in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move left in the plain
     */
    void moveLeft(int howMuch);

    /**
     * Moves the form right in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move right in the plain
     */
    void moveRight(int howMuch);
}
