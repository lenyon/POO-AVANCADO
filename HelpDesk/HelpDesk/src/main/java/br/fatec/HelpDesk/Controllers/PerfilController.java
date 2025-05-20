package br.fatec.HelpDesk.Controllers;

import br.fatec.HelpDesk.Entities.Perfil;
import br.fatec.HelpDesk.Services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @PostMapping("/add/{perfil}")
    public ResponseBody ResponseEntity<PerfilDTO> cadastrar (@PathVariable String perfil) {
        Perfil perfil = perfilService.cadastrar(perfil);
        return ResponseEntity.ok().body(PerfilDTO.valueof(perfil));
    }

}
