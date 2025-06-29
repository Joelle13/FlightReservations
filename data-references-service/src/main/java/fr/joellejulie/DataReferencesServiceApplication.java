package fr.joellejulie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataReferencesServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataReferencesServiceApplication.class, args);
    }
}