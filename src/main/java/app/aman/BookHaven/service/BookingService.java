package app.aman.BookHaven.service;

import app.aman.BookHaven.dto.BookingDto;
import app.aman.BookHaven.dto.BookingRequest;
import app.aman.BookHaven.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
