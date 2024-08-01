package com.biblioteca.gerenciamento.Model;

import java.util.List;

import com.biblioteca.gerenciamento.Enum.StatusEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LivroModel {
    @Id
    private long isbn;


    private List<String> nomeAutor;
    private String titulo;
    private int qtdPaginas;
    private String tema;
    private int anoPublicacao;
    private int edicao;
    private String editora;
    private String quantidadeCopias;
    
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    
    
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public List<String> getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(List<String> nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getQuantidadeCopias() {
        return quantidadeCopias;
    }
    public void setQuantidadeCopias(String quantidadeCopias) {
        this.quantidadeCopias = quantidadeCopias;
    }
    
    public StatusEnum getStatus() {
        return status;
    }
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    
    
}
