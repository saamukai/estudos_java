
package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

/**
 *
 * @author samuk
 */
public class ConjuntoComportado {
    public static void main(String[] args) { 
        // Sinal de maior e menor que, define o tipo obrigatorio da lista, só poderar receber strings
        //tem que ser dos dois lados
        SortedSet<String> listaAprovados = new TreeSet<>();
        
        
        //set n respeita ordem de adição, n é ordenado
        //n necessariamente sera impresso nesa ordems, a menos que use TreeSet no lugar de HashSet
        //pode também usar um SortedSet junto com TreeSet
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");
       
        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }
        
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);
        
        for(int n: nums) {
            System.out.println(n);
        }
    }
}
