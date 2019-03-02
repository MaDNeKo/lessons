package ships;
import humans.*;
import ports.*;

public class Ship {
    private String shipClass = "AbstractShip";
    private int displacement;
    private int numOfSeats;
    private int shipId;
    private Human[] human;
    private int freeSeats;
    //private int priority;
    private static int lastId = 0;
    private Port currPort;

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public int getShipId() {
        return shipId;
    }

    public Ship (int displacement, int numOfSeats) {
        this.displacement = displacement;
        this.numOfSeats = numOfSeats;
        this.freeSeats = numOfSeats;
        this.human = new Human[numOfSeats];
        this.shipId = ++lastId;
    }

    public String toString() {
        return "Тип корабля: " + shipClass + "\n Ship id: " + this.shipId + "\n Водоизмещение " + this.displacement +
                "\n Число мест " + this.numOfSeats;
    }

    public boolean addHuman(Human someHuman) {
        if (this.freeSeats == 0) {
            System.out.println("Мест нет корбаль не может приянть больше");
            return false;
        }
        else {
            this.human[this.human.length-this.freeSeats] = someHuman;
            this.freeSeats--;
            return true;
        }
    }

}
