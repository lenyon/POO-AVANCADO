package br.fatec.HelpDesk.Dtos;

import br.fatec.HelpDesk.Entities.Categoria;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.io.Serial;
import java.io.Serializable;

public record CategoriaDTO(
        Long id,
        String servico
) implements Serializable {

    @Serial
    public static final long serialVersionUID = 412423532345L;

    public static CategoriaDTO valueof(Categoria categoria) {
        if (categoria != null) {
            return  new CategoriaDTO(
                    categoria.getId(),
                    categoria.getServico()
            );
        }
        return null;
    }

    public static  Categoria toCategoria(CategoriaDTO dto) {
        if (dto != null) {
            Categoria categoria = new Categoria();
            categoria.setId(dto.id);
            categoria.setServico(dto.servico);
            return categoria;
        }
        return null;
    }


}
