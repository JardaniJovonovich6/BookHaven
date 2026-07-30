package app.aman.BookHaven.service;

import app.aman.BookHaven.entity.Room;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}
