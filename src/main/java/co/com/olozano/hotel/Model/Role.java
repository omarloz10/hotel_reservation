package co.com.olozano.hotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "role_id")
    private UUID id;

    @ManyToMany()
    @JoinTable(
            name = "role_permission",
            joinColumns = @JoinColumn(name = "rol_perm_rol_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_perm_perm_id")
    )
    private List<Permission> permissions;

    @Column(name = "role_name")
    private String name;
}
