package app.aman.BookHaven.service;

import app.aman.BookHaven.dto.HotelDto;
import app.aman.BookHaven.dto.HotelSearchRequest;
import app.aman.BookHaven.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);


    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
