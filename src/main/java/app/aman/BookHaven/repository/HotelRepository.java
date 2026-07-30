package app.aman.BookHaven.repository;

import app.aman.BookHaven.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//added all three repositories
public interface HotelRepository extends JpaRepository<Hotel , Long> {

}
