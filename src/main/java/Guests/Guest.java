package Guests;

import Rooms.Room;

public class Guest {

    private String name;
    private double wallet;

    public Guest(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean canAffordRoom(double inputPrice){
        return wallet >= inputPrice;
    }

    public void payRate(Room inputRoom) {
        wallet -= inputRoom.getPrice();
    }
}
