
package colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author samuk
 */
public class ConjuntoComportado {
    public static void main(String[] args) { 
        // Sinal de maior e menor que, define o tipo obrigatorio da lista, só poderar receber strings
        //tem que ser dos dois lados
        Set<String> listaAprovados = new HashSet<>();
        
        
        //set n respeita ordem de adição, n é ordenado
        //n necessariamente sera impresso nesa ordems, a menos que use TreeSet no lugar de HashSet
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");
        
        System.out.println(listaAprovados);
        
        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }
    }
}
