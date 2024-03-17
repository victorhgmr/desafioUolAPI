package victormr.desafiouol.model.dtos;

import victormr.desafiouol.model.GroupType;

public record PlayerDTO(
        String name,
        String email,
        String phone,
        GroupType groupType

) {
}
