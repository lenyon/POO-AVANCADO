package br.fatec.HelpDesk.Services;

import br.fatec.HelpDesk.Dtos.UsuarioDTO;
import br.fatec.HelpDesk.Entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public Usuario cadastrar (UsuarioDTO dto) {
        Usuario usuario = UsuarioDTO.toUsuario(dto);
        if(usuario != null) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }
}
