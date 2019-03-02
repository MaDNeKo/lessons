package humans;
import ships.*;
import ports.*;

public class Human {
    private String name;
    private Ship ship;
    private Port port;
    boolean intoPort = false;
    boolean intoShip = false;

    public Human (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void joinShip(Ship someShip) {
        if (intoShip) System.out.println("Он в море не может пересесть на другой корабль");
        else if (someShip.addHuman(this)) {
            this.ship = someShip;
            intoShip = true;
            intoPort = false;
        }
    }
    public void joinPort(Port somePort) {
        this.port = somePort;
        intoPort = true;
        intoShip = false;
    }

    public String toString() {
        if(intoShip){
            return this.name + " сейчас на корабле №" + this.ship.getShipId();
        }
        else if (intoPort) {
            return this.name + " сейчас в порту №" ;
        }
        else {
            return this.name + " сейчас гуляет по суше";
        }
    }
}