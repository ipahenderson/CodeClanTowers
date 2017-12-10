package Hotel;

import Rooms. *;
import Guests.*;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private double cash;
    private ArrayList<Room> rooms;
    private ArrayList<Bedroom> vacantBedrooms;


    public Hotel(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.rooms = new ArrayList<>();
        this.vacantBedrooms = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        for (Room room : rooms){
            if (room.isEmpty() && room instanceof Bedroom){
                vacantBedrooms.add((Bedroom)room);
            }
        }
        return vacantBedrooms;
    }


    public void addRoom(Room inputRoom) {
        this.rooms.add(inputRoom);
    }

    public void checkIn(Guest inputGuest, Room inputRoom) {
        if (!inputRoom.isFull()){
            inputGuest.payRate(inputRoom);
            inputRoom.addGuest(inputGuest);
            cash += inputRoom.getPrice();
        }
    }
}



