package com.senai.primeirospassos.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.senai.primeirospassos.model.UsuarioModel;

@Repository
public class UsuarioView {

    public void save (UsuarioModel usuario){
        System.out.println("SALVAR - Recebendo um novo usuário");
        System.out.println(usuario);
    }

    public List<UsuarioModel> listAll(){
        List<UsuarioModel> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioModel ("Mateus", "Mudar@123"));
        usuarios.add(new UsuarioModel("Joaquim", "Mudar@123"));
        usuarios.add(new UsuarioModel("Carlos Alberto", "Mudar@123"));
        return usuarios;
    }
}
