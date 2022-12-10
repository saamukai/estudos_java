/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janta;

public class Jantar {
    public static void main(String[] args) {
         Comida c1 = new Comida("Feijao", 0.300);
         Comida c2 = new Comida("Arroz", 0.200);
         
         Pessoa p = new Pessoa("Faustao", 100.37);
         
         p.comer(c1);
         System.out.println("Pessoa " + p.nome + " comeu " + c1.nome);
         System.out.printf("Peso da pessoa %s eh de %.2f kg\n\n", p.nome, p.peso);
         
         p.comer(c2);
         System.out.println("Pessoa " + p.nome + " comeu " + c2.nome);
         System.out.printf("Peso da pessoa %s eh de %.2f kg\n", p.nome, p.peso);
    }
}
