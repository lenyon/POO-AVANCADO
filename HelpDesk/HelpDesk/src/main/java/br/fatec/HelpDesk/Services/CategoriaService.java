package br.fatec.HelpDesk.Services;

import br.fatec.HelpDesk.Entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria cadastrar(String servico) {
        Categoria categoria = new Categoria();
        categoria.setService(servico);
        return  categoriaRepository.save(categoria);
    }
}

