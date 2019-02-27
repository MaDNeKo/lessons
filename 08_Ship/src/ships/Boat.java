package ships;

public class Boat extends Ship {
    private String shipClass = "Лодка";
    public Boat (int displacement, int numOfSeats) {
        super(displacement, numOfSeats);
        super.setShipClass(this.shipClass);
    }
}
