package com.senai.primeirospassos.controller;
import com.senai.primeirospassos.model.UsuarioModel;
import com.senai.primeirospassos.view.UsuarioView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioView view;

    @GetMapping("/usuarios")
    public List<UsuarioModel> getAll(){
        return view.listAll();
    }

    
}