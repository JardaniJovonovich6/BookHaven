package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//added all three repositories
@Repository
public interface InventoryRepository extends JpaRepository<Inventory , Long> {
}
