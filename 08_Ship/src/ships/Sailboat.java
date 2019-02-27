package ships;

public class Sailboat extends Ship {
    private String shipClass = "Парусник";
    private int mast;
    public Sailboat(int displacement, int numOfSeats, int mast) {
        super(displacement, numOfSeats);
        this.mast = mast;
        super.setShipClass(this.shipClass);
    }
}
