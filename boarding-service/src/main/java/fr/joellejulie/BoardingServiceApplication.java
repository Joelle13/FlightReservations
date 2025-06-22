package fr.joellejulie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BoardingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardingServiceApplication.class, args);
    }
}