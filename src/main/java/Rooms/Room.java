package Rooms;
import Guests.Guest;

import java.util.ArrayList;

public class Room {
    protected RoomType roomType;
    protected ArrayList<Guest> guests;
    protected int capacity;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
        this.capacity = roomType.getTypeCapacity();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public int setCapacity(int setNum){
       return this.capacity = setNum;
    }

}
