package app.aman.BookHaven.service;

import app.aman.BookHaven.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
