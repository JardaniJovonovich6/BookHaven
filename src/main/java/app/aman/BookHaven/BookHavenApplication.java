package app.aman.BookHaven;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class BookHavenApplication {
    //commit resolving commit 2

    static {
        // Load .env values into System properties BEFORE Spring initializes
        Dotenv dotenv = Dotenv.configure()
                .directory("./") // Explicitly point to root project directory
                .ignoreIfMissing()
                .systemProperties() // Directly injects into System properties before Spring starts
                .load();
    }

	public static void main(String[] args) {
        // to reload env elements automatically using Dotenv

		SpringApplication.run(BookHavenApplication.class, args);
	}



}
