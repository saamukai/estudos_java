/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_vendas;

/**
 *
 * @author samuk
 */
public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.nomeCliente = "João Pedro";
        
        compra1.addItem("Caneta", 20, 7.4);
        compra1.addItem("Borracha", 12, 3.89);
        compra1.addItem("Caderno", 3, 18.79);
        
        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
    }
    
}
