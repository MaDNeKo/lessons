package humans;

public class Passenger extends Human {
    private int ticketNum;
    private static int lastTick = 0;
    public Passenger (String name) {
        super(name);
        this.ticketNum = ++lastTick;
    }

    public String toString() {
        return super.toString() + " билет №" + this.ticketNum;
    }
}
