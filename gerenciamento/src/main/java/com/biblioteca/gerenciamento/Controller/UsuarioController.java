package com.biblioteca.gerenciamento.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gerenciamento.Model.UsuarioModel;
import com.biblioteca.gerenciamento.Repository.UsuarioRepository;




@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

   
    
    @PostMapping("/adicionarusuario")
    public UsuarioModel adicionarUsuario(@RequestBody UsuarioModel usuario) {
        
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/listarusuarios")
    public List<UsuarioModel> getUsuarios() {
        return usuarioRepository.findAll();
    }
    
}
