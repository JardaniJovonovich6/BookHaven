package app.aman.BookHaven.dto;

import app.aman.BookHaven.entity.User;
import app.aman.BookHaven.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
