package app.aman.BookHaven.dto;

import app.aman.BookHaven.entity.HotelContactInfo;

public class HotelDto {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
