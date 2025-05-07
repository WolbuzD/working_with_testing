package com.ps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

//    @Test
//    void checkIn() {
//        // AAA
//        // Arrange
//        Room room = new Room(2, 200, false, false); // already occupied
//
//        // Act
//        room.checkIn(); // should not allow check-in because room is occupied
//
//        // Assert
//        assertTrue(room.isOccupied()); // still occupied
//        assertFalse(room.isAvailable()); // not available due to being occupied
//    }

    @Test
    void checkOut() {
        //Arrange
        Room room = new Room(5, 150, false, true);
        //act :
        room.checkOut();
        //Assert:
        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());

    }
}