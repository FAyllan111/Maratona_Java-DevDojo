package academy.devdojo.maratonajava.javacore.Aintroducaoclssses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclssses.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Zezim";
        professor.idade = 589;
        professor.sexo = 'B';
        //imprimindo todos os dados na mesma linha

        System.out.println("Nome: "+professor.nome + " Idade: " + professor.idade +" Sexo: " + professor.sexo);
    }
}
