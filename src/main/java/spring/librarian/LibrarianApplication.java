package spring.librarian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.LogManager;

@SpringBootApplication
public class LibrarianApplication {


    public static void main(String[] args) {
        SpringApplication.run(LibrarianApplication.class, args);
    }

}
