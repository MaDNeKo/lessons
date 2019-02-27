package ports;

import ships.*;

import java.util.Scanner;

public class Shipyard extends Port {
    private static int maxShips = 5;
    private static int lastShip = 0;
    private Ship[] buildShips = new Ship[maxShips];
    public Shipyard () {
        super(maxShips);
    }

    public void buildShip (String shipType, int displacement, int numOfSeats) {
        if (lastShip < maxShips) {
            System.out.println("Верфь переполнена, посторить корабль нельзя");
            return;
        }
        if (shipType.equals("Ark")) {
            this.buildShips[lastShip] = new Ark(displacement, numOfSeats);
            lastShip++;
        }
        else if (shipType.equals("Boat")) {
            this.buildShips[lastShip] = new Boat(displacement, numOfSeats);
            lastShip++;
        }
        else if (shipType.equals("Sailboat")) {
            Scanner in = new Scanner(System.in);
            System.out.print("Число мачт: ");
            int mast = in.nextInt();
            this.buildShips[lastShip] = new Sailboat(displacement, numOfSeats, mast);
            lastShip++;
        }
        else {
            System.out.print("Ошибка. Мы не смогли посторить корабль");
            return;
        }
        System.out.println("Корабль успешно построен");
        System.out.println(buildShips[lastShip-1].toString());
    }
}
