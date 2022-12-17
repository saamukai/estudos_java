 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_curso;

import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }
    
    void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
