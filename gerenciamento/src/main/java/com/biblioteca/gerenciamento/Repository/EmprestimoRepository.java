package com.biblioteca.gerenciamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.gerenciamento.Model.EmprestimoModel;

public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Integer> {

}
