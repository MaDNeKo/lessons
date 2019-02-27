package ships;

public class Ark extends Ship {
    private String shipClass = "Баржа";
    public Ark (int displacement, int numOfSeats) {
        super(displacement, numOfSeats);
        super.setShipClass(this.shipClass);
    }
}
