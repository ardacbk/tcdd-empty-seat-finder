package tr.edu.tr.TCDDTicketFinder.Dto;

import lombok.Data;

@Data
public class TicketDTO {
    private String name;
    private String cabinName;
    private int availabilityCount;
}
