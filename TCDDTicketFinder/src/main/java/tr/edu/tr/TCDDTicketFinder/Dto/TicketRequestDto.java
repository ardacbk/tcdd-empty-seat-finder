package tr.edu.tr.TCDDTicketFinder.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class TicketRequestDto {
    List<PassengerTypeCount> passengerTypeCounts;
    List<SearchRoutes> searchRoutes;
    private String searchType = "DOMESTIC";
    private boolean searchReservation = false;

    public record PassengerTypeCount(int id, int count) {
    }

    public record SearchRoutes(int departureStationId, String departureStationName, int arrivalStationId,
                               String arrivalStationName,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime departureDate) {
    }
}