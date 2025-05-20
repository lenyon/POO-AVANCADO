package br.fatec.HelpDesk.Dtos;

import br.fatec.HelpDesk.Entities.Perfil;

import java.io.Serializable;

public record PerfilDTO(
        Long id,
        String perfil
) implements Serializable {

    public static final long serialVersionUID = 1525424351243L;

    public PerfilDTO valueof(Perfil perfil) {
        if (perfil != null) {
            return new PerfilDTO(
                    perfil.getId(),
                    perfil.getPerfil()
            );
        }
        return null;
    }

    public Perfil toPerfil (PerfilDTO perfilDTO) {
        if(perfilDTO != null) {
            Perfil perfil = new Perfil(perfilDTO.perfil);
            perfil.setId(perfilDTO.id);
            return perfil;
        }
        return null;
    }

}
