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
@Table(name = "credentials")
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "credent_id")
    private UUID id;

    @Column(name = "credent_password")
    private String password;

    @Column(name = "credent_last_updated_password")
    private LocalDateTime lastUpdatedPassword;
}
