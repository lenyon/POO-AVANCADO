package br.fatec.HelpDesk.Services;

import br.fatec.HelpDesk.Entities.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    PerfilRepository perfilRepository;

    public Perfil cadastrar(String nomePerfil) {
        return perfilRepository.save(new Perfil (nomePerfil));
    }
}
