package victormr.desafiouol.model;


import jakarta.persistence.*;
import lombok.*;
import victormr.desafiouol.model.dtos.PlayerDTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Column(unique = true)
    @Email
    @NotBlank
    private String email;

    @Column(unique = true)
    private String phone;
    private String codiname;
    private GroupType groupType;

    public Player(PlayerDTO dto){
        this.name = dto.name();
        this.email = dto.email();
        this.phone = dto.phone();
        this.groupType = dto.groupType();
    }
}
