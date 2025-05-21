package br.fatec.HelpDesk.Dtos;

import br.fatec.HelpDesk.Entities.Perfil;
import br.fatec.HelpDesk.Entities.Usuario;

import java.io.Serial;
import java.io.Serializable;

public record UsuarioDTO(
        Long id,
        String nome,
        String email,
        String senha,
        String cargo,
        String telefone,
        PerfilDTO perfil
) implements Serializable {

    @Serial
    public static final long serialVersionUID = 124213456453734645L;

    public static UsuarioDTO valueof(Usuario usuario) {
        if (usuario != null) {
            return new UsuarioDTO (
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getEmail(),
                    usuario.getSenha(),
                    usuario.getCargo(),
                    usuario.getTelefone(),
                    PerfilDTO.valueof(usuario.getPerfil())
            );
        }
        return null;
    }

    public static Usuario toUsario (UsuarioDTO dto) {
        if (dto != null) {
            Usuario usuario = new Usuario();
            usuario.setId(dto.id);
            usuario.setNome(dto.nome);
            usuario.setEmail(dto.email);
            usuario.setSenha(dto.senha);
            usuario.setTelefone(dto.telefone);
            if(dto.perfil != null) {
                usuario.setPerfil(PerfilDTO.toPerfil(dto.perfil));
            }
            //Aqui vai dar problema porque irá retornar o pefil null e retornar.
            usuario.setPerfil(null);
            return  usuario;
        }
        return null;
    }

}
