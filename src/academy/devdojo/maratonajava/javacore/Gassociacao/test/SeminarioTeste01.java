package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Escolinha ABC");
        Professor professor = new Professor("Claudio","Matematica");
        Aluno aluno = new Aluno("José",10);
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Calculo IV",alunosSeminario, local);

        Seminario[] seminarioDisponivel = {seminario};

        professor.setSeminarios(seminarioDisponivel);
        
        professor.imprime();


    }
}
