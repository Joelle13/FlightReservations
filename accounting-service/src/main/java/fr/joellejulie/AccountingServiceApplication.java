package fr.joellejulie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AccountingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountingServiceApplication.class, args);
    }
}
