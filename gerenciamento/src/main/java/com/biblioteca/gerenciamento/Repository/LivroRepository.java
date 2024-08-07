package com.biblioteca.gerenciamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.gerenciamento.Model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Integer> {

    
}
