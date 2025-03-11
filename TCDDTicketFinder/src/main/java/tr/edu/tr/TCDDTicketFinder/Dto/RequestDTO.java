package tr.edu.tr.TCDDTicketFinder.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestDTO {
    private int departureStationId;
    private int arrivalStationId;
    private String departureStationName;
    private String arrivalStationName;
    private String cabinName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime departureDate;
}
