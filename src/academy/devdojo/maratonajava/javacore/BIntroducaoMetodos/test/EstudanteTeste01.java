package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome ="Po";
        estudante01.idade = 58;
        estudante01.sexo = 'm';

        estudante02.nome ="Xifu";
        estudante02.idade = 89;
        estudante02.sexo = 'm';

        impressora.imprime(estudante01);

        System.out.println("-----------------");

        impressora.imprime(estudante02);

        // agora para os metodos de referencia passa-se a copia da referencia, ou seja a copia do valor de referencia  ou seja a mesma referencia 

        //System.out.println("Nome: "+estudante01.nome + " Idade: " + estudante01.idade +" Sexo: " + estudante01.sexo);
        //System.out.println("Nome: "+estudante02.nome + " Idade: " + estudante02.idade +" Sexo: " + estudante02.sexo);
    }
}
