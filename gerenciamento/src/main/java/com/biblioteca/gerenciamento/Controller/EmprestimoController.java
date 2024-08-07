package com.biblioteca.gerenciamento.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gerenciamento.Model.EmprestimoModel;
import com.biblioteca.gerenciamento.Repository.EmprestimoRepository;


@RestController
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @PostMapping("/fazeremprestimo")
    public EmprestimoModel emprestimos(@RequestBody EmprestimoModel emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }
    
}
