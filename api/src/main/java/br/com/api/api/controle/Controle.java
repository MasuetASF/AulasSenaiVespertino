package br.com.api.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api.modelo.Pessoa;
import br.com.api.api.repositorio.PessoaRepositorio;





@RestController
public class Controle {

    @Autowired
    private PessoaRepositorio funcao;

    @PostMapping("/tudo")
    public Pessoa salvar(@RequestBody Pessoa pessoinha){
        return funcao.save(pessoinha);
    }

    //listAll;
    @GetMapping("/tudo")
    public List<Pessoa> busca() {
        return funcao.findAll();
    }
    
    //getById;
    @GetMapping("/tudo/{id}")
    public List<Pessoa> selecionaId(@PathVariable int id) {
        return funcao.findByid(id);
    }

    //edit;
    @PutMapping("/tudo")
    public Pessoa editar(@RequestBody Pessoa pessoinha) {        
        return funcao.save(pessoinha);
    }
    
    
    
    @GetMapping("/ola")
    public String mensagem(){
        return "Olá Mundo!";
    }

    @GetMapping("/bemvindo")
    public String bemVindo() {
        return "Bem vindo ao Spring";
    }

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem vindo(a) " +nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p){
        return p;
    }
    
}
