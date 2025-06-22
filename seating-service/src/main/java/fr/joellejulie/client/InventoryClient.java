package fr.joellejulie.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface InventoryClient {

    @PutMapping("/v1/inventorys/flights/{flightId}")
    int updateInventory(@PathVariable Long flightId, @RequestParam int delta);

    @GetMapping("/v1/inventorys/flights/{flightId}")
    int getAvailableSeats(@PathVariable Long flightId);
}
