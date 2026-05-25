package com.Carreira.PA_GerenciadorDeProjetos.repositories;


import com.Carreira.PA_GerenciadorDeProjetos.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel,Long> {
}

