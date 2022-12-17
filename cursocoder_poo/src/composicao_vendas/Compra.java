/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_vendas;

import java.util.ArrayList;


public class Compra {
    String nomeCliente; // representa um cliente, todavia é pra ser outra classe
    ArrayList<Item> itens = new ArrayList<>();
   
    void addItem(String nome, int quantidade, double preco) {
        this.addItem(new Item(nome, quantidade, preco));
    }
    
    void addItem(Item item){
        itens.add(item);
        item.compra = this;
    }
    
    double getValorTotal(){
        double total = 0;
        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
