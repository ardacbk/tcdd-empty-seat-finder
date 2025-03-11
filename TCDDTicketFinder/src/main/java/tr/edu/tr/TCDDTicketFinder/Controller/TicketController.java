package tr.edu.tr.TCDDTicketFinder.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.tr.TCDDTicketFinder.Dto.RequestDTO;
import tr.edu.tr.TCDDTicketFinder.Dto.TicketDTO;
import tr.edu.tr.TCDDTicketFinder.Dto.TicketRequestDto;
import tr.edu.tr.TCDDTicketFinder.Dto.TicketResponseDto;
import tr.edu.tr.TCDDTicketFinder.Service.TicketService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    @GetMapping("/get")
    public ResponseEntity<List<TicketDTO>> getTickets(@RequestBody RequestDTO requestDTO){
        return ResponseEntity.ok(ticketService.getTickets(requestDTO));
    }

}
