package com.ps;

public class Main {
    public static void main(String[] args) {
      Room room = new Room(40, 124, false, false);


      room.checkIn();
      room.checkOut();

    }
}

/*
* package com.ps;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {


    @Test
    public void testCheckIn()
    {
        //arrange step
        Room room1 = new Room(1,100,false,false);
        //boolean isOccupiedExpected = true;
        boolean isDirtyExpected = true;
        boolean isAvailableExpected = false;

        //act
        room1.checkIn();

        boolean isOccupiedActual = room1.isOccupied();
        boolean isDirtyActual = room1.isDirty();
        boolean isAvailableActual = room1.isAvailable();

        //assert
        assertTrue(isOccupiedActual);
        //assertEquals(isOccupiedExpected,isOccupiedActual);
        assertEquals(isDirtyExpected,isDirtyActual);
        assertEquals(isAvailableExpected,isAvailableActual);
    }

    @Test
    public void testCheckOut()
    {
        //arrange
        Room room1 = new Room(1,100,true,true);
        boolean isOccupiedExpected = false;

        //act
        room1.checkOut();
        boolean isOccuupiedActual = room1.isOccupied();

        //assert
        assertEquals(isOccupiedExpected,isOccuupiedActual);

    }

    @Test
    public void testCleanRoom()
    {
        //arrange
        Room room1 = new Room(1,100,true,true);
        boolean isDirtyExpected = false;

        //act
        room1.cleanRoom();
        boolean isDirtyActual = room1.isDirty();

        //assert
        assertEquals(isDirtyExpected,isDirtyActual);
    }



}*/