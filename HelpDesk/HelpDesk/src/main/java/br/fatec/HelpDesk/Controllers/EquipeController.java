package br.fatec.HelpDesk.Controllers;


import br.fatec.HelpDesk.Dtos.EquipeDTO;
import br.fatec.HelpDesk.Entities.Equipe;
import br.fatec.HelpDesk.Services.EquipeService;
import br.fatec.HelpDesk.mappers.MapperGeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @PostMapping("/add/{nomeEquipe}")
    public @ResponseBody ResponseEntity<EquipeDTO> cadastrar(@PathVariable String nomeEquipe) {
        Equipe equipe = equipeService.cadastrar(nomeEquipe);
        return ResponseEntity.ok().body(MapperGeral.mapEquipeToDTO(equipe));
    }
}
