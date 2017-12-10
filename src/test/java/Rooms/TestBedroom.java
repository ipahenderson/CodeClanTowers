package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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




}
