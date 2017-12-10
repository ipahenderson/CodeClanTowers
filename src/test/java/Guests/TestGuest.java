package Guests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Bill", 500.00);
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
        assertEquals(500.00, guest1.getWallet(), 0.01);
    }

    @Test
    public void canSetWallet(){
        guest1.setWallet(600.00);
        assertEquals(600.00, guest1.getWallet(), 0.01);
    }



}
