package br.fatec.HelpDesk.mappers;

import br.fatec.HelpDesk.Dtos.CategoriaDTO;
import br.fatec.HelpDesk.Dtos.EquipeDTO;
import br.fatec.HelpDesk.Dtos.PerfilDTO;
import br.fatec.HelpDesk.Dtos.UsuarioDTO;
import br.fatec.HelpDesk.Entities.Categoria;
import br.fatec.HelpDesk.Entities.Equipe;
import br.fatec.HelpDesk.Entities.Perfil;
import br.fatec.HelpDesk.Entities.Usuario;

import java.io.Serial;
import java.io.Serializable;

public class MapperGeral implements Serializable {

    @Serial
    public static final long serialVersionUID = 453252364373746L;

    public static CategoriaDTO mapCategoriaToDTO (Categoria categoria) {
        return  categoria != null ?
                CategoriaDTO.valueof(categoria) : null;
    }

    public static Categoria mapDtoToCategoria (CategoriaDTO dto) {
        return dto != null ?
                CategoriaDTO.toCategoria(dto) : null;
    }

    public static EquipeDTO mapEquipeToDTO (Equipe equipe) {
        return  equipe != null ?
                EquipeDTO.valueof(equipe) : null;
    }

    public static Equipe mapDtoToEquipe (EquipeDTO dto) {
        return dto != null ?
                EquipeDTO.toEquipe(dto) : null;
    }

    public static PerfilDTO mapPerfilToDTO (Perfil perfil) {
        return  perfil != null ?
                PerfilDTO.valueof(perfil) : null;
    }

    public static Perfil mapDtoToPerfil (PerfilDTO dto) {
        return dto != null ?
                PerfilDTO.toPerfil(dto) : null;
    }

    public static UsuarioDTO mapUsuarioToDTO (Usuario usuario) {
        return  usuario != null ?
                UsuarioDTO.valueof(usuario) : null;
    }

    public static Usuario mapDtoToUsuario (UsuarioDTO dto) {
        return dto != null ?
                UsuarioDTO.toUsario(dto) : null;
    }




}
