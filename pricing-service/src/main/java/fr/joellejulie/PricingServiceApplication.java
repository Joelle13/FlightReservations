package fr.joellejulie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PricingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }
}