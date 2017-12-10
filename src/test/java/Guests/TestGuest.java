package Guests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Bill", 500);

    }

    @Test
    public void canGetName(){
        assertEquals("Bill", guest1.getName());
    }

    @Test
    public void canSetName(){
        guest1.setName("Bob");
        assertEquals("Bob", guest1.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(500, guest1.getWallet());
    }

    @Test
    public void canSetWallet(){
        guest1.setWallet(600);
        assertEquals(600, guest1.getWallet());
    }

}
