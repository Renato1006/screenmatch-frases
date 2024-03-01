package br.com.renato.screenmatchfrases.controller;

import br.com.renato.screenmatchfrases.dto.FraseDTO;
import br.com.renato.screenmatchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseDoBanco(){
        return service.obterFraseDoBanco();
    }
}
