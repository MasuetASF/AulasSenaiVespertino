package com.senai.primeirospassos.model;

public class UsuarioModel {
    private String login;
    private String password;


    public UsuarioModel(){

    }

    //Método construtor
    public UsuarioModel(String login, String password){
        this.login = login;
        this.password = password;
    }


    //Método get e set
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{"+
                "login = " + login+
                "\n, password = " + password +"\n"+"}";
    }
}
