package app.aman.BookHaven.config;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {
    public StripeConfig(@Value("${stripe.secret-key:sk_test_dummy}") String stripeSecretKey) {
        Stripe.apiKey = stripeSecretKey;
    }
}
