package com.wandeilson.transitoapi.api.controller;

import com.wandeilson.transitoapi.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar (){
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Joao");
        proprietario1.setTelefone("77 9 8383883");
        proprietario1.setEmail("joao@gmail.com");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria");
        proprietario2.setTelefone("77 9 8383883");
        proprietario2.setEmail("maria@gmail.com");

        return Arrays.asList(proprietario1, proprietario2);

    }
}
