package fr.joellejulie.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "flight-service")
public interface FlightClient {

   // @GetMapping("/v1/flights/{id}")
   // FlightDto getFlightById(@PathVariable("id") Long id);

}
