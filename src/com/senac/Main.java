package com.senac;

import com.senac.modelos.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco(29106555, 445);
        endereco.setRua("Alvarenga");
        endereco.setBairro("Serpente rosa");
        endereco.setCidade("Caxambu");
        endereco.setEstado("Linopolis");


        Usuario usuario = new Usuario("1522218181", "988855522");
        usuario.setIdade(23);
        usuario.setNome("Joel");
        usuario.setEmail("joelsilva@hotmail.com");
        usuario.setEndereco(endereco);


        Animal animal = new Animal("Cachorro", "Shitzu", "Preto", "Jose");
        animal.setUsuario(usuario);

        Produto produto = new Produto();
        produto.setDescricao("Shampo");
        produto.setDataValidade("01/02/2024");
        produto.setMarca("PetEspuma");
        produto.setPrecoCompra(10.00);
        produto.setPrecoVenda(12.50);
        produto.setQuantidade(5);

        Produto sabao = new Produto();
        sabao.setDescricao("Sabonete");
        sabao.setDataValidade("05/05/2023");
        sabao.setMarca("Pom Pom");
        sabao.setPrecoCompra(7.50);
        sabao.setPrecoVenda(12.50);
        sabao.setQuantidade(10);

        Produto coleira = new Produto();
        coleira.setDescricao("Coleira");
        coleira.setDataValidade("N/A");
        coleira.setMarca("Dog Bruto");
        coleira.setPrecoCompra(6.50);
        coleira.setPrecoVenda(9.50);
        coleira.setQuantidade(2);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(sabao);
        produtos.add(coleira);

        Venda venda = new Venda(produtos);
        venda.setUsuario(usuario);
        venda.setPrecoVenda(12.50);
        venda.setQuantidade(17);
        venda.getTotalVenda();



        System.out.println();


    }

}