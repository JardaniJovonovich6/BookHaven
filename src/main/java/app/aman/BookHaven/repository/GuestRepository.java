package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest  , Long> {
}
