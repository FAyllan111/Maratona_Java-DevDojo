package academy.devdojo.maratonajava.javacore.Aintroducaoclssses.test;
//importa a classes


import academy.devdojo.maratonajava.javacore.Aintroducaoclssses.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //criou o modelo da classe estudante
        //inserindo atributps
        estudante.nome = "Wil.iam";
        estudante.idade = 65;
        estudante.sexo = 'm';
        //imprimindo os atributos do obejro criado da classe esutudante
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }

}
