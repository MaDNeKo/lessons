package ships;

public class Ark extends Ship {
    private int numOfDecks;
    private String shipClass = "Баржа";
    public Ark (int displacement, int numOfSeats,  int numOfDecks) {
        super(displacement, numOfSeats);
        super.setShipClass(this.shipClass);
        this.numOfDecks = numOfDecks;
    }
}
