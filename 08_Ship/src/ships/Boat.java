package ships;

public class Boat extends Ship {
    private int numOfOars;
    private String shipClass = "Лодка";
    public Boat (int displacement, int numOfSeats, int numOfOars) {
        super(displacement, numOfSeats);
        super.setShipClass(this.shipClass);
        this.numOfOars = numOfOars;
    }
    public String toString() {
        return super.toString() + " весел: " + this.numOfOars;
    }
}
