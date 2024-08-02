package com.biblioteca.gerenciamento.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gerenciamento.Model.LivroModel;
import com.biblioteca.gerenciamento.Repository.LivroRepository;

@RestController
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/teste")
    public String teste() {
        return"ta joia";
    }
    
    @PostMapping("/adicionarlivro")
    public LivroModel adicionarLivro(@RequestBody LivroModel livro) {
        return livroRepository.save(livro);
    }

    @GetMapping("/listarlivros")
    public List<LivroModel> getlivros() {
        return livroRepository.findAll();
    }    
}
