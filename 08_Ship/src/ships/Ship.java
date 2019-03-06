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

    //почему не в конструкторе?
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

    //есть разные layout-ы классов
    //
    //объявления внутренних классов
    //публичные константы
    //непубличные константы
    //все поля что ниже, но статические
    //приватные поля
    //протектед поля
    //публинчые поля
    //конструкторы
    //геттеры
    //сеттеры
    //приватные методы
    //протектед методы
    //публичные методы
    //(причем по возможности служебные методы
    //выше тех, кто их использует)
    //переоперделение методов базового класса
    //переопределение методов Object

    //переместить вниз метода
    //и навесить @Override
    public String toString() {
        return "Тип корабля: " + shipClass + "\n Ship id: " + this.shipId + "\n Водоизмещение " + this.displacement +
                "\n Число мест " + this.numOfSeats;
    }

    //рекомендую не ставить зисы, кроме как в конструторе
    //и вообще мода меняется
    //в 17 студии нерекомендую ставить зисы везде где можно не ставить
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
