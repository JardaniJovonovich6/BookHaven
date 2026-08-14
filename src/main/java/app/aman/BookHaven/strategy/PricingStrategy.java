package app.aman.BookHaven.strategy;



import app.aman.BookHaven.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
