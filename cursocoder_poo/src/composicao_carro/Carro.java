/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_carro;

public class Carro {
    Motor motor = new Motor(); //relação unidirecional, carro tem motor, toda via esse motor pode estar em outro carro, um pra um
    
    // Motor motor;
    // relação bidirecional, obriga o carro ter um motor e um motor ter um carro.
    // Carro () {
    //     this.motor = new Motor(this);
    // }
    
    void acelerar() {
        if (motor.fatorInjecao < 2.6)
            motor.fatorInjecao += 0.4;
    }
    
    void frear() {
        if (motor.fatorInjecao > 0.5)
            motor.fatorInjecao -= 0.4;
    }
    
    void ligar () {
        motor.ligado = true;
    }
    void desligar () {
        motor.ligado = false;
    }
    
    boolean estaLigado() {
        return motor.ligado;
    }
}
