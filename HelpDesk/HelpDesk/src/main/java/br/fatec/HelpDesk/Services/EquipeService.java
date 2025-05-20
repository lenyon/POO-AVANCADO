package br.fatec.HelpDesk.Services;

import br.fatec.HelpDesk.Entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    EquipeRepository equipeRepository;

    public Equipe cadastrar (String nomeEquipe) {
        Equipe equipe = new Equipe();
        equipe.setEquipe(nomeEquipe);
        return equipeRepository.save(equipe);
    }
}
