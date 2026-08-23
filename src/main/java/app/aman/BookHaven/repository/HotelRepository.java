package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Hotel;
import app.aman.BookHaven.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

//added all three repositories
public interface HotelRepository extends JpaRepository<Hotel , Long> {
    List<Hotel> findByOwner(User user);

}
