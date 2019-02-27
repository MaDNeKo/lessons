package ships;



public class Ship {
    private String shipClass = "AbstractShip";
    private int displacement;
    private int numOfSeats;
    private int shipId;
    //private int priority;
    private static int lastId = 0;

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
        this.shipId = ++lastId;
    }

    public String toString() {
        return "Тип корабля: " + shipClass + "\n Ship id: " + this.shipId + "\n Водоизмещение " + this.displacement +
                "\n Число мест " + this.numOfSeats;
    }
}
