package co.com.olozano.hotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "usr_id")
    private UUID id;

    @Column(name = "usr_name")
    private String name;

    @Column(name = "usr_lastname")
    private String lastname;

    @Column(name = "usr_document_number")
    private String documentNumber;

    @Column(name = "usr_phone_number")
    private String phoneNumber;

    @Column(name = "usr_email")
    private String email;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
