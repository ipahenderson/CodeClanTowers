package Rooms;

import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    private Room room1;


    @Before
    public void before() {
        room1 = new Room(RoomType.SINGLE);

    }




//    Read & Write

    @Test
    public void getCapacity() {
        assertEquals(1, room1.getCapacity());

    }

    @Test
    public void getPrice(){
        assertEquals(40.00,room1.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        room1.setPrice(60.00);
        assertEquals(60.00,room1.getPrice(), 0.01);
    }



}


