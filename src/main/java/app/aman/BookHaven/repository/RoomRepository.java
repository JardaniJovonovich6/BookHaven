package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room , Long > {
}
