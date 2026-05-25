package com.Carreira.PA_GerenciadorDeProjetos.controllers;


import com.Carreira.PA_GerenciadorDeProjetos.models.ProjetoModel;
import com.Carreira.PA_GerenciadorDeProjetos.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path="/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> findAllProjeto(){
        return ResponseEntity.ok(projetoService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjetoModel> criarProjeto(@RequestBody ProjetoModel projetoModel){
        ProjetoModel novo = projetoService.criar(projetoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> buscarProjeto(@PathVariable Long id){
        Optional<ProjetoModel> projeto = projetoService.buscarPorId(id);

        if (projeto.isPresent()) {
            return ResponseEntity.ok(projeto.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjetoModel> atualizarProjeto(@PathVariable Long id,
                                                         @RequestBody ProjetoModel projetoModel){
        Optional<ProjetoModel> existente = projetoService.buscarPorId(id);

        if (existente.isPresent()) {
            ProjetoModel atualizado = projetoService.atualizar(id, projetoModel);
            return ResponseEntity.ok(atualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProjeto(@PathVariable Long id){
        Optional<ProjetoModel> existente = projetoService.buscarPorId(id);

        if (existente.isPresent()) {
            projetoService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

