package ships;

public class Sailboat extends Ship {
    private String shipClass = "Парусник";
    private int mast; //почему не numOfMust

    public Sailboat(int displacement, int numOfSeats, int mast) {
        super(displacement, numOfSeats);
        this.mast = mast;
        super.setShipClass(this.shipClass);
    }

    public String toString() {
        return super.toString() + " мачт " + mast;
    }
}