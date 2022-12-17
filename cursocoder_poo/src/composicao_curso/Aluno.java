/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_curso;

import java.util.ArrayList;

/**
 *
 * @author samuk
 */
public class Aluno {
    final String nome;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    Curso obterCursoPorNome(String nome){
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
    
    void addCurso (Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", cursos=" + cursos + '}';
    }
    
    
}
