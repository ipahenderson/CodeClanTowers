package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestBedroom {

    Bedroom bedroom;



    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 101);

    }

    @Test
    public void capacityByType(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }




}
