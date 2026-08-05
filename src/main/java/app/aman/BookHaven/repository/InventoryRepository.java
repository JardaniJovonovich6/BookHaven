package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Inventory;
import app.aman.BookHaven.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

//added all three repositories
@Repository
public interface InventoryRepository extends JpaRepository<Inventory , Long> {
    void deleteByDateAfterAndRoom(LocalDate today, Room room);
}
