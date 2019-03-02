import humans.*;
import ports.*;
import ships.*;

public class Main {
    public static void main(String[] args) {
        Ship one = new Ship(10, 100);
        Ship two = new Sailboat(100, 10, 3);
        Ship three = new Ark (500, 500, 2);
        Ship four = new Boat(10, 2, 2);
        /*System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());*/
        Port first = new Port(1);
        first.addShip(two);
        first.addShip(one);
        Passenger pass = new Passenger("Толя");
        System.out.println(pass.toString());
        pass.joinPort(first);
        System.out.println(pass.toString());
        pass.joinShip(four);
        System.out.println(pass.toString());
        pass.joinShip(three);
        Passenger pass2 = new Passenger("Дядя Коля");
        pass2.joinShip(four);
        System.out.println(pass2.toString());
    }
}
