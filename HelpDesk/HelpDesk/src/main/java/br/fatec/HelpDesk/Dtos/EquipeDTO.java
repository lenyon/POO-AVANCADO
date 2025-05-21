package br.fatec.HelpDesk.Dtos;

import br.fatec.HelpDesk.Entities.Equipe;

import java.io.Serial;
import java.io.Serializable;

public record EquipeDTO(
        Long id,
        String equipe
) implements Serializable {

    @Serial
    public static final long serialVersionUID = 432412412431234L;

    public static EquipeDTO valueof(Equipe equipe) {
        if (equipe != null) {
            return new EquipeDTO(
                    equipe.getId(),
                    equipe.getEquipe()
            );
        }
        return null;
    }

    public static Equipe toEquipe (EquipeDTO dto) {
        if (dto != null) {
            Equipe equipe = new Equipe();
            equipe.setId(dto.id);
            equipe.setEquipe(dto.equipe);
            return equipe;
        }
        return null;
    }

}
