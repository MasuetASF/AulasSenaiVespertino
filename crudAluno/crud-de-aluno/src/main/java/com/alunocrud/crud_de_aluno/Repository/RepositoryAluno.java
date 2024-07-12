package com.alunocrud.crud_de_aluno.Repository;

import org.springframework.data.repository.CrudRepository;

import com.alunocrud.crud_de_aluno.Model.Aluno;

public interface RepositoryAluno extends CrudRepository<Aluno, Integer > {

    
}
