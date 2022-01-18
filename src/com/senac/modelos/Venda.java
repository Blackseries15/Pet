package com.senac.modelos;

import java.util.List;

public class Venda {
    private List<Produto> produtos;
    private double precoVenda;
    private int quantidade;
    private double totalVenda;
    private Usuario usuario;


    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Venda(List<Produto> produtos) {
        this.produtos = produtos;
        calcularTotalVenda();
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda() {
        this.totalVenda = precoVenda;
    }



    private void calcularTotalVenda() {
        for (Produto produto : produtos){
            totalVenda = totalVenda + produto.getQuantidade() * produto.getPrecoVenda();
        }

    }

    public List<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(List<Produto> produto) {
        this.produtos = produto;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


