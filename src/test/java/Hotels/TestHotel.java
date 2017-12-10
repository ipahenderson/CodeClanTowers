package Hotels;
import Guests.*;
import Rooms.*;
import Hotel.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestHotel {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers", 4000.00);
        guest1 = new Guest("Bill", 500.00);
        guest2 = new Guest("Simon", 700.00);
        guest3 = new Guest("Rab", 5000.00);
        guest4 = new Guest("Gib", 100.00);
        diningRoom = new DiningRoom(RoomType.DININGROOM);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, "Eagle Room");
        bedroom1 = new Bedroom(RoomType.SINGLE, 101);
        bedroom2 = new Bedroom(RoomType.DOUBLE, 102);
        bedroom3 = new Bedroom(RoomType.DOUBLE, 103);
        bedroom4 = new Bedroom(RoomType.FAMILY, 104);
        hotel.addRoom(diningRoom);
        hotel.addRoom(conferenceRoom);
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
    }





    @Test
    public void canAddRooms(){
        assertEquals(6, hotel.getRooms().size());
    }

    @Test
    public void canCheckInAndCharge(){
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuests().size());
        assertEquals(460.00, guest1.getWallet(), 0.01);
        assertEquals(4040.00, hotel.getCash(), 0.01);
    }

    @Test
    public void canCheckGuestOut(){
        hotel.checkIn(guest2, bedroom1);
        hotel.checkOut(guest2, bedroom1);
        assertEquals(true, bedroom1.isEmpty());
    }


    @Test
    public void cantCheckInIfNoFunds(){
        hotel.checkIn(guest1, conferenceRoom);
        assertEquals(true, conferenceRoom.isEmpty());
    }

    @Test
    public void getVacantBedrooms() {
        assertEquals(4, hotel.getVacantBedrooms().size());
        hotel.checkIn(guest1,bedroom1);
        assertEquals(3, hotel.getVacantBedrooms().size());
    }






//    Read & Write Tests

    @Test
    public void getName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void setName() {
        hotel.setName("Ian's Hotel");
        assertEquals("Ian's Hotel", hotel.getName());
    }

    @Test
    public void getCash() {
        assertEquals(4000.00, hotel.getCash(), 0.01);
    }

    @Test
    public void setCash() {
        hotel.setCash(5000.00);
        assertEquals(5000.00, hotel.getCash(), 0.01);
    }






}
