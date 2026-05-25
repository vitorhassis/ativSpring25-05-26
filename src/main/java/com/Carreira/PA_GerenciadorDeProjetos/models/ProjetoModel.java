package com.Carreira.PA_GerenciadorDeProjetos.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_Projeto")
public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome Projeto")
    private String nome;
    @Column(name = "Data Inicio Projeto")
    private LocalDate inicioProjeto;
    @Column(name = "Data Fim Projeto")
    private LocalDate fimProjeto;

    public ProjetoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicioProjeto() {
        return inicioProjeto;
    }

    public void setInicioProjeto(LocalDate inicioProjeto) {
        this.inicioProjeto = inicioProjeto;
    }

    public LocalDate getFimProjeto() {
        return fimProjeto;
    }

    public void setFimProjeto(LocalDate fimProjeto) {
        this.fimProjeto = fimProjeto;
    }
}
