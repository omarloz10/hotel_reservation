package co.com.olozano.hotel.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record ReservationDTO(
        UUID id,
        LocalDate initialDate,
        LocalDate endedDate,
        RoomDTO room,
        LocalDateTime checkIn,
        LocalDateTime checkOut,
        String status
) {
}
