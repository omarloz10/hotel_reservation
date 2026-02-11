package co.com.olozano.hotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reserv_id")
    private UUID id;

    @Column(name = "reserv_initial_date")
    private LocalDate initialDate;

    @Column(name = "reserv_ended_date")
    private LocalDate endedDate;

    @Column(name = "reserv_check_in")
    private LocalDateTime checkIn;

    @Column(name = "reserv_check_out")
    private LocalDateTime checkOut;

    @Column(name = "reserv_status")
    private LocalDateTime status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
