package br.com.renato.screenmatchfrases.service;

import br.com.renato.screenmatchfrases.dto.FraseDTO;
import br.com.renato.screenmatchfrases.model.Frase;
import br.com.renato.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseDoBanco() {
        Frase frase = repository.buscaFraseNoBanco();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
