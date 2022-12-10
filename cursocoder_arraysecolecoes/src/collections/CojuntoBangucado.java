/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.HashSet;

/**
 *
 * @author samuk
 */

// TRATANDO ERROS


public class CojuntoBangucado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        
        // não aceita tipos primitivos, são convertidos em objetos
        conjunto.add(1.2); //double -> Double()
        conjunto.add(true);
        conjunto.add(1);
        conjunto.add("Teste"); //t maiusculo
        conjunto.add('x');
        
        System.out.println(conjunto.size()); // 5
        
        // hashset case sensitive, obs:
        conjunto.add("teste"); //t minusculo
        System.out.println(conjunto.size()); // 6
        conjunto.add('x'); // n pode adicionar, n aceita elementos repetitidos
        System.out.println(conjunto.size()); // 6
        
        conjunto.remove('x'); //remove um elemento e retornar um boolean
        conjunto.contains ('x'); //verifica se o conjunto contém determinado elemento, retorna bool
        
        // é possivel fazer isso:
        // Set nums = new HashSet(); // define um set e cria uma new hash set
        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        
        System.out.println(nums); //imprime o conjunto como se fosse uma array
        System.out.println(conjunto);
        
        conjunto.addAll(nums); //uniao de conjuntos com nums, n altera o nums, e sim o conjunto, n tem ordem
        conjunto.retainAll(nums); //mesma logica de cima, só que a intersecção
        
        conjunto.clear(); //limpa o conjunto, deixa vazio
    }
}
