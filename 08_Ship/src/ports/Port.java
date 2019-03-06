package ports;
import humans.*;
import ships.*;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private int portId;
    private static int lastId; //часто называют unic и подумайте над _uniqueID
    private int maxShips;
    private Ship[] shipsAtDocs;
    private int lastShip = 0;
    private List<Passenger> passengers; //порт знает только про корабли
    public Port (int maxShips) {
        this.maxShips = maxShips;
        this.shipsAtDocs = new Ship[this.maxShips];
        this.passengers = new ArrayList<>();
        this.portId = ++lastId;
    }

    public Ship getShipsAtDocs(int index) {
        return shipsAtDocs[index];
    }

    public Ship[] getShipsList() {
        return shipsAtDocs;
    }

    public Passenger getPassangers(int index) {
        return this.passengers.get(index);
    }

    public List<Passenger> getPassangersList() {
        return passengers;
    }

    // надо дать возможность узнать забит ли порт
    public void addShip (Ship newShip) {
        if (lastShip < this.shipsAtDocs.length) {
            this.shipsAtDocs[lastShip] = newShip;
            this.lastShip++;
            System.out.println("Корабль успешно зашёл в порт. Количество кораблей в порту: " + lastShip);
        }
        else {
            System.out.println("Порт забит под завязку, корабль не смог зайти и утонул.");
        }
    }
    public void addPassToPort(Passenger passenger) {
        this.passengers.add(passenger);
    }

}
