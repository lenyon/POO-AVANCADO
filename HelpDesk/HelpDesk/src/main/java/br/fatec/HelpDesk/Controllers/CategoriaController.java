package br.fatec.HelpDesk.Controllers;


import br.fatec.HelpDesk.Dtos.CategoriaDTO;
import br.fatec.HelpDesk.Entities.Categoria;
import br.fatec.HelpDesk.Services.CategoriaService;
import br.fatec.HelpDesk.mappers.MapperGeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/add/{servico}")
    public @ResponseBody ResponseEntity<CategoriaDTO> cadastrar (@PathVariable String servico ) {
        Categoria categoria = categoriaService.cadastrar(servico);
        return ResponseEntity.ok().body(MapperGeral.mapCategoriaToDTO(categoria));
    }

}
