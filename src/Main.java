import ro.fortech.OOP2.Movable;
import ro.fortech.OOP2.MovableCircle;
import ro.fortech.OOP2.MovablePoint;
import ro.fortech.OOP2.exceptions.MovableException;

public class Main {

    public static void main(String[] args) throws MovableException {

//        Movable point = new MovablePoint(0, 0, 50, 50);
//        System.out.println(point);
//        System.out.println();
//
//        point.moveLeft();
//        System.out.println(point);
//        point.moveDown(700);
//        System.out.println(point);
//        point.moveUp(1500);
//        System.out.println(point);
//        point.moveRight(900);
//        System.out.println(point);
//        point.moveDown(800);
//        System.out.println(point);


        // InvalidCreationOfCircleException: The circle around point could not be created!
//        Movable circle = new MovableCircle(750, 750, 250, 250,300);

        // InvalidSpeedMovementException: The speed movement of Y is incorect!!!
//        Movable circle = new MovableCircle(750, 750, 250, 300,50);


//        Movable circle = new MovableCircle(-750, 750, 250, 250,50);
//        System.out.println(circle);
//        // MoveDownException: Moving down could not be done! Circle out of plan !!!
//        circle.moveDown();

//        Movable circle = new MovableCircle(750, 750, 250, 250,50);
//        System.out.println(circle);
//        // MoveUpException: Moving up could not be done! Circle out of plan !!!
//        circle.moveUp();


        Movable circle = new MovableCircle(650, 650, 200, 200,200);
        System.out.println(circle);

//        circle.moveLeft(400);
//        System.out.println(circle);

//        circle.moveDown(300);
//        System.out.println(circle);

//        circle.moveRight(1300);
//        System.out.println(circle);

//        circle.moveLeft(300);
//        System.out.println(circle);



//        circle.moveLeft();
//        circle.moveRight();
//        circle.moveUp();
//        circle.moveDown();
//        System.out.println(circle);
//
//        circle.moveUp();
//        circle.moveUp();
//        System.out.println(circle);

//        System.out.println(circle);
//        circle.moveDown(300);
//        circle.moveDown(300);
//        circle.moveDown(300);
//        circle.moveDown(300);
//        circle.moveUp(1000);
//        circle.moveUp(850);
//        circle.moveRight(900);
//        circle.moveLeft(1200);
//        circle.moveLeft(350);
//        System.out.println(circle);


//        circle.moveLeft(950);   // arunca exceptie MoveLeftException: Moving left could not be done! Circle out of plan !!!
//        circle.moveUp(650);   // arunca exceptie MoveUpException: Moving up could not be done! Circle out of plan !!!
//        circle.moveRight(950);  // arunca exceptie MoveRightException: Moving right could not be done! Circle out of plan !!!
//        circle.moveDown(950);     // arunca exceptie Moving down could not be done! Circle out of plan !!!
//        circle.moveDown(-200);      // arunca exceptie InvalidValueException: Invalid value for movement!




//        circle.moveUp(1200);
//        System.out.println(circle);
//        circle.moveRight(600);
//        System.out.println(circle);
//        circle.moveLeft(1500);
//        System.out.println(circle);
//        circle.moveDown(800);
//        System.out.println(circle);
//        circle.moveDown(200);
//        System.out.println(circle);
//        circle.moveRight(850);
//        System.out.println(circle);

//        Movable m2 = new MovableCircle(100, 100, 100, 100, 100);
//        System.out.println(m2);
//
//        m2.moveUp();
//        m2.moveLeft();
//        m2.moveRight();
//        m2.moveDown();
//        System.out.println(m2);     // the expected output should be the same as the initial values
//        System.out.println();
//
//
//        /* test the upMovement */
//        Movable m3 = new MovableCircle(800, 800, 100, 100, 100);
//        System.out.println(m3);
//
//        m3.moveUp();
//        System.out.println(m3);     // output is x=900, y=800, xSpeed=100, ySpeed=100} with radius = 100
//        m3.moveUp();                // output MoveUpException: Moving up could not be done! Circle out of plan !!!


        /**
         * tests for exceptions
         */
//        Movable m4 = new MovableCircle(800, 800, 100, 100, 150);
//        System.out.println(m4);

//        m4.moveUp();                // output: MoveUpException: Moving up could not be done! Circle out of plan !!!
//        m4.moveRight();             // output: MoveRightException: Moving right could not be done! Circle out of plan !!!
//        m4.moveLeft();             // output: MovableCircle with center at MovablePoint{x=800, y=700, xSpeed=100, ySpeed=100} with radius = 150
//        m4.moveDown();             // output: MovableCircle with center at MovablePoint{x=700, y=800, xSpeed=100, ySpeed=100} with radius = 150

//        m4.moveDown(1600);  // output: MovableCircle with center at MovablePoint{x=-800, y=800, xSpeed=100, ySpeed=100} with radius = 150
//        m4.moveLeft(1600);  // output: MovableCircle with center at MovablePoint{x=-800, y=-800, xSpeed=100, ySpeed=100} with radius = 150
//        m4.moveLeft();             // output: MoveLeftException: Moving left could not be done! Circle out of plan !!!
//        m4.moveDown();             // output: MoveDownException: Moving down could not be done! Circle out of plan !!!


//        System.out.println(m4);



















    }


}
