/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_desafio;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();
    
    void addItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }
    
    void addItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }
    
    double getValorTotal() {
        double total = 0;
        for(Item item: itens){
            total += item.qtd * item.produto.preco;
        }
        return total;
    }
}
