/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_desafio;

import java.util.ArrayList;

/**
 *
 * @author samuk
 */
public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    double obterValorTotal () {
        double totalCompras = 0;
        for (Compra compraAtual: compras){
            totalCompras += compraAtual.getValorTotal();
        }
        return totalCompras;
    }
}
