package app.aman.BookHaven.repository;

import app.aman.BookHaven.dto.RoomPriceDto;
import app.aman.BookHaven.entity.Hotel;
import app.aman.BookHaven.entity.Inventory;
import app.aman.BookHaven.entity.Room;
import app.aman.BookHaven.entity.User;
import app.aman.BookHaven.entity.enums.Role;
import app.aman.BookHaven.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
public class InventoryRepositoryTest {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindRoomAveragePrice() {
        // Create a hotel
        Hotel hotel = new Hotel();
        hotel.setName("Test Hotel");
        hotel.setCity("Test City");
        hotel.setActive(true);
        
        // Create a user for the hotel owner
        User user = new User();
        user.setName("Test User");
        user.setEmail("test@example.com");
        user.setPassword("password");
        user.setRoles(Set.of(Role.HOTEL_MANAGER));
        user = userRepository.save(user);
        
        hotel.setOwner(user);
        hotel = hotelRepository.save(hotel);

        // Create a room
        Room room = new Room();
        room.setHotel(hotel);
        room.setType("Test Room");
        room.setBasePrice(BigDecimal.valueOf(100.0));
        room.setTotalCount(10);
        room.setCapacity(2);
        room = roomRepository.save(room);

        // Create inventory entries
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(2);
        Long dateCount = 3L;
        Long roomsCount = 1L;

        for (int i = 0; i < 3; i++) {
            Inventory inventory = new Inventory();
            inventory.setHotel(hotel);
            inventory.setRoom(room);
            inventory.setDate(startDate.plusDays(i));
            inventory.setPrice(BigDecimal.valueOf(100.0 + i * 10));
            inventory.setTotalCount(10);
            inventory.setBookedCount(0);
            inventory.setReservedCount(0);
            inventory.setClosed(false);
            inventory.setSurgeFactor(BigDecimal.valueOf(1.0));
            inventory.setCity("Test City");
            inventoryRepository.save(inventory);
        }

        // Test the findRoomAveragePrice method
        List<RoomPriceDto> roomPriceDtos = inventoryRepository.findRoomAveragePrice(
                hotel.getId(),
                startDate,
                endDate,
                roomsCount,
                dateCount
        );

        assertNotNull(roomPriceDtos);
        System.out.println("Room Price DTOs: " + roomPriceDtos);
    }
}