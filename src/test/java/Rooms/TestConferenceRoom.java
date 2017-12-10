package Rooms;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestConferenceRoom {

    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, "Eagle Room");
    }


    @Test
    public void canGetName(){
        assertEquals("Eagle Room", conferenceRoom.getRoomName());
    }

    @Test
    public void canSetName(){
        conferenceRoom.setRoomName("Hawk Room");
        assertEquals("Hawk Room", conferenceRoom.getRoomName());
    }


    @Test
    public void roomHasType(){
        assertEquals("Conference Room", conferenceRoom.getRoomTypeName());
    }




}
