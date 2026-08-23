package app.aman.BookHaven.dto;

import app.aman.BookHaven.entity.User;
import app.aman.BookHaven.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
