package app.aman.BookHaven.dto;


import app.aman.BookHaven.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomPriceDto {
    private Room room;
    private Double price;
}
