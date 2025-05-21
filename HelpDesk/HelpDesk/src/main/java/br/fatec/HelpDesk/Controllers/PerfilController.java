package br.fatec.HelpDesk.Controllers;

import br.fatec.HelpDesk.Dtos.PerfilDTO;
import br.fatec.HelpDesk.Entities.Perfil;
import br.fatec.HelpDesk.Services.PerfilService;
import br.fatec.HelpDesk.mappers.MapperGeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @PostMapping("/add/{perfil}")
    public @ResponseBody ResponseEntity<PerfilDTO> cadastrar (@PathVariable String perfil) {
        Perfil perf = perfilService.cadastrar(perfil);
        return ResponseEntity.ok().body(MapperGeral.mapPerfilToDTO(perf));
    }

}
