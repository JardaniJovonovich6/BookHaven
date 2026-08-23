package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Guest;
import app.aman.BookHaven.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest  , Long> {
    List<Guest> findByUser(User user);
}
