package br.com.api.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    

    @PutMapping("/tudo/{id}")
    public void editar(@PathVariable int id, @RequestBody Pessoa pessoinha) {
        
        if (funcao.existsById(id)) {
            pessoinha.setId(id);
            funcao.save(pessoinha);
        } else {
            
            throw new RuntimeException("Pessoa com ID " + id + " não encontrada");
        }
    }

    @DeleteMapping("/tudo/{id}")
    public void deletar(@PathVariable int id) {
        if (funcao.existsById(id)) {
        funcao.deleteById(id);
        }else{
            throw new RuntimeException("Pessoa com ID " + id + " não encontrada");
        }
    }

    @DeleteMapping("/tudo/deletar")
    public void deleteAll(){
        funcao.deleteAll();
    }
    
    
}
