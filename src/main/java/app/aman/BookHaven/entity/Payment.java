package app.aman.BookHaven.entity;


import app.aman.BookHaven.entity.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Disabled entity — the {@code @Entity} annotation has been removed intentionally.
 * JPA / Hibernate will NOT manage this class anymore, so no {@code payment} table
 * is created and it can't be referenced from repositories or JPQL queries.
 *
 * The project uses Stripe Checkout Sessions (via {@code Booking.paymentSessionId})
 * for payment handling, so this entity is no longer needed.
 * Keep this class for reference only; do not re-add {@code @Entity}.
 */
// @Entity  <-- deliberately removed
    @Deprecated
public class Payment {

    private Long id;

    private String transactionId;

    private PaymentStatus paymentStatus;

    private BigDecimal amount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Booking booking;

}
