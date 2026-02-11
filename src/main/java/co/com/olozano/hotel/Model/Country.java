package co.com.olozano.hotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "countries")
public class Country {

    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ct_id")
    private UUID id;

    @Column(name = "ct_name")
    private String name;

    @Column(name = "ct_code_2_letters")
    private String code2Letter;

    @Column(name = "ct_code_3_letters")
    private String code3Letter;

}
