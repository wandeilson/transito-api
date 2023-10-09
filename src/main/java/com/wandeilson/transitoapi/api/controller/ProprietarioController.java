package com.wandeilson.transitoapi.api.controller;

import com.wandeilson.transitoapi.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProprietarioController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar (){
        return entityManager
                .createQuery("from Proprietario", Proprietario.class).getResultList();
    }
}
