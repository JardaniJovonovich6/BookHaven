package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Room;
import lombok.Locked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//added all three repositories
public interface RoomRepository extends JpaRepository<Room , Long > {
}
