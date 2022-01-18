package com.senac.modelos;

public class Animal {
    private String tipo;
    private String raca;
    private String cor;
    private String nome;
    private Usuario usuario;



    public Animal(String tipo, String raca, String cor, String nome) {
        this.tipo = tipo;
        this.raca = raca;
        this.cor = cor;
        this.nome = nome;


    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String especie) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
