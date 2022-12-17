/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao_curso;

/**
 *
 * @author samuk
 */
public class CursoTeste {
    
    public static void main(String[] args) {
        //RELAÇÃO BIDIRECIONAL MUITAS PARA MUITOS, N PARA N
        
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Carlos");
     
        Curso curso1 = new Curso ("Java");
        Curso curso2 = new Curso ("Design");
        Curso curso3 = new Curso ("Web");
        
        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);
        
        curso2.addAluno(aluno3);
        curso2.addAluno(aluno1);
        
        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);
        
        for(Aluno aluno: curso1.alunos) {
            System.out.println("Meu nome eh " + aluno.nome + " e estou matriculado no curso 1");
            System.out.println();
        }
        for(Aluno aluno: curso2.alunos) {
            System.out.println("Meu nome eh " + aluno.nome + " e estou matriculado no curso 2");
            System.out.println();
        }
        for(Aluno aluno: curso3.alunos) {
            System.out.println("Meu nome eh " + aluno.nome + " e estou matriculado no curso 3");
            System.out.println();
        }
        System.out.println("------------------------------------");
        
        System.out.println("Meu nome eh " + aluno1.nome + " e estou matriculado nos cursos: ");
        for(Curso curso: aluno1.cursos) {
            System.out.println(curso);
        }
        
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
        
        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
