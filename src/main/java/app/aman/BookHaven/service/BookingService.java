package app.aman.BookHaven.service;

import app.aman.BookHaven.dto.BookingDto;
import app.aman.BookHaven.dto.BookingRequest;
import app.aman.BookHaven.dto.GuestDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface BookingService {
    @Nullable BookingDto initialiseBooking(BookingRequest bookingRequest);

    @Nullable BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
