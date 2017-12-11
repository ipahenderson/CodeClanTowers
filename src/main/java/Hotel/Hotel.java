package Hotel;

import Rooms. *;
import Guests.*;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private double cash;
    private ArrayList<Room> rooms;
    private ArrayList<Bedroom> vacantBedrooms;


    public Hotel(String name, double cash) {
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
        vacantBedrooms.clear();
        for (Room room : rooms) {
            if (room.isEmpty() && room instanceof Bedroom) {
                vacantBedrooms.add((Bedroom) room);
            }
        }
        return vacantBedrooms;
    }


    public void addRoom(Room inputRoom) {
        this.rooms.add(inputRoom);
    }

    public void checkIn(Guest inputGuest, Room inputRoom, int nights) {
        double totalPrice = (inputRoom.getPrice() * nights);
        if (inputGuest.canAffordRoom(totalPrice)) {
            if (!inputRoom.isFull()) {
                for (int i =0 ; i < nights ; i++){
                    inputGuest.payRate(inputRoom);
                }
                inputRoom.addGuest(inputGuest);
                cash += totalPrice;
            }
        }
    }

    public void checkOut(Guest inputGuest, Room inputRoom) {
        inputRoom.getGuests().remove(inputGuest);
    }

    public String findGuest(String inputGuestName) {
        String result = "";
        ArrayList<Room> roomsSearch = new ArrayList<>();

        for (Room room : rooms) {
            for (Guest guesttofind : room.getGuests())
                if (inputGuestName == guesttofind.getName()){
                    roomsSearch.add(room);
            }
            for (Room roomfind : roomsSearch) {
                if (roomfind instanceof ConferenceRoom) {
                    result = ((ConferenceRoom) roomfind).getRoomName();
                } else if (roomfind instanceof DiningRoom) {
                    result = roomfind.getRoomTypeName();
                } else if (roomfind instanceof Bedroom) {
                    result = String.format("Room: " + ((Bedroom) roomfind).getRoomNumber());
                }
            }
        }
        return result;
    }

}






