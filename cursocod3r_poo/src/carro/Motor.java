/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author samuk
 */
public class Motor {
    
    
    // Carro carro; /// exemplo de relacionamento bidirecional
    boolean ligado = false;
    double fatorInjecao = 1;
    
    // vai precisar passar um carro pro motor, um motor pode ter um carro 
    // Motor(Carro carro) { // exemplo de relacionamento biderecional;;
    //     this.carro = carro;
    // }
    
    int giros(){
        if(!ligado){
            return 0;
        } else {
            return (int) Math.round(fatorInjecao*3000);
        }
    }
}
