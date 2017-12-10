package Rooms;
import Guests.Guest;

import java.util.ArrayList;

public class Room {
    protected RoomType roomType;
    protected ArrayList<Guest> guests;
    protected int capacity;
    protected  double price;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
        this.capacity = roomType.getTypeCapacity();
        this.price = roomType.getTypePrice();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getRoomTypeName(){
        return roomType.roomTypeName();
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double inputPrice){
        this.price = inputPrice;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest inputGuest){
        guests.add(inputGuest);
    }


    public int countGuests(){
        return guests.size();
    }

    public boolean isFull(){
        return countGuests() >= capacity;
    }

    public boolean isEmpty(){
        return countGuests() == 0;
    }


}
