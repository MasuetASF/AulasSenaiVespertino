package com.biblioteca.gerenciamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.biblioteca.gerenciamento.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    
}
