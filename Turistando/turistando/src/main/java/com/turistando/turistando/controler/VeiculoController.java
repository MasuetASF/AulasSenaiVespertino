package com.turistando.turistando.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.turistando.turistando.model.VeiculoModel;
import com.turistando.turistando.repository.VeiculoRepository;




@RestController
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;
    
    @PostMapping("/cadastrarveiculo")
    public VeiculoModel cadastrarVeiculo(@RequestBody VeiculoModel veiculoModel){
        return veiculoRepository.save(veiculoModel);
    }
    
    @GetMapping("/listarveiculos")
    public List<VeiculoModel> listarVeiculos(){
        return veiculoRepository.findAll();
    }

    @PutMapping("alterarveiculo/{id}")
    public VeiculoModel alterarVeiculo(@PathVariable String id, @RequestBody VeiculoModel veiculo){
        return veiculoRepository.save(veiculo);
    }
    
    @DeleteMapping("apagarveiculo/{id}")
    public void excluirVeiculo(@PathVariable String id) {
        veiculoRepository.deleteById(id);
    }
    
}