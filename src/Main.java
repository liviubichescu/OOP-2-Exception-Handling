import ro.fortech.OOP2.Movable;
import ro.fortech.OOP2.MovableCircle;
import ro.fortech.OOP2.MovablePoint;
import ro.fortech.OOP2.exceptions.MovableException;

public class Main {

    public static void main(String[] args) throws MovableException {

        Movable point = new MovablePoint(0, 0, 50, 50);     // upcast
        System.out.println(point);

        point.moveLeft();
        point.moveLeft();
        System.out.println(point);
        point.moveDown(-700);
        System.out.println(point);
        point.moveUp(1500);
        System.out.println(point);
        point.moveRight(100);
        System.out.println(point);
        point.moveDown(-800);
        System.out.println(point);

//        System.out.println();
//
//        Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
//        System.out.println(m2);
//        m2.moveRight();
//        System.out.println(m2);

    }


}
