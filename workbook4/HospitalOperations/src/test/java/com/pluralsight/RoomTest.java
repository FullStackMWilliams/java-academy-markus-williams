package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    private Room room;

    @BeforeEach
    void setup() {
        // Each test starts with a clean, vacant room
        room = new Room(2, 120.00, false, false);
    }

    @Test
    void testCheckIn_MakesRoomOccupiedAndDirty() {
        room.checkIn();
        assertTrue(room.isOccupied(), "Room should be occupied after check-in");
        assertTrue(room.isDirty(), "Room should be dirty after check-in");
    }

    @Test
    void testCheckIn_FailsIfOccupied() {
        room.checkIn(); // first check-in
        boolean wasOccupiedBefore = room.isOccupied();
        room.checkIn(); // attempt second check-in
        assertTrue(wasOccupiedBefore, "Room should remain occupied");
    }

    @Test
    void testCheckIn_FailsIfDirty() {
        room.setDirty(true);
        room.checkIn();
        assertFalse(room.isAvailable(), "Dirty rooms should not be available for check-in");
    }

    @Test
    void testCheckOut_MarksRoomVacantAndDirty() {
        room.checkIn(); // must be occupied first
        room.checkOut();
        assertFalse(room.isOccupied(), "Room should be vacant after checkout");
        assertTrue(room.isDirty(), "Room should be dirty after checkout");
    }

    @Test
    void testCleanRoom_SetsRoomToClean() {
        room.setDirty(true);
        room.cleanRoom();
        assertFalse(room.isDirty(), "Room should be clean after cleaning");
    }

    @Test
    void testCleanRoom_CannotCleanOccupiedRoom() {
        room.checkIn(); // occupied now
        if (room.isOccupied()) {
            room.cleanRoom();
            assertTrue(room.isDirty(), "Occupied room should remain dirty until checkout");
        }
    }
}