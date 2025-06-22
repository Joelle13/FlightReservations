package fr.joellejulie.controller;

import fr.joellejulie.dto.SeatingDto;
import fr.joellejulie.entity.Seating;
import fr.joellejulie.service.SeatingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/seatings")
@AllArgsConstructor
public class SeatingController {

    private final SeatingService seatingService;

    @PostMapping("{seatNumber}/flights/{flightId}")
    public ResponseEntity<SeatingDto> assignSeat(@PathVariable String seatNumber,@PathVariable Long flightId){
        Seating seating = seatingService.allocateSeat(seatNumber,flightId);
        return ResponseEntity.ok(SeatingDto.mapToDTO(seating));
    }

    @GetMapping
    public ResponseEntity<List<SeatingDto>> getAllSeating() {
        List<Seating> list = seatingService.getAllSeating();
        List<SeatingDto> dtos = list.stream()
                .map(SeatingDto::mapToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

}
