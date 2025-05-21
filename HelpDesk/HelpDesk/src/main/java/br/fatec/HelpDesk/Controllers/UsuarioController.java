package br.fatec.HelpDesk.Controllers;


import br.fatec.HelpDesk.Dtos.UsuarioDTO;
import br.fatec.HelpDesk.Entities.Usuario;
import br.fatec.HelpDesk.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping ("/add")
    //RequestPart provavelmente tem que ser mudado para RequestBody
    public @ResponseBody ResponseEntity<UsuarioDTO> cadastrar (@RequestBody UsuarioDTO dto) {
        Usuario usuario = usuarioService.cadastrar(dto);
        return ResponseEntity.ok().body(UsuarioDTO.valueof(usuario));
    }
}
