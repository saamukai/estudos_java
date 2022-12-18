/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_desafio;

/**
 *
 * @author samuk
 */
public class LojaTeste {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro");
        
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 2.00, 5);
        compra1.addItem(new Produto("Borracha", 0.5), 5);
        
        cliente1.compras.add(compra1);
        
        System.out.println(compra1.getValorTotal());
        System.out.println(cliente1.obterValorTotal());
        
        Compra compra2 = new Compra();
        compra2.addItem("Carderno", 11.00, 2);
        
        cliente1.compras.add(compra2);
        
        System.out.println(compra2.getValorTotal());
        System.out.println(cliente1.obterValorTotal());
        
        
   
    }
 
    
}
