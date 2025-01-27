package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Po";
        estudante01.idade = 58;
        estudante01.sexo = 'm';

        estudante02.nome = "Xifu";
        estudante02.idade = 89;
        estudante02.sexo = 'm';

        //chama o metodo impriome de dentro da classe estudante, que lá esta usando o this.
        estudante01.imprime();
        estudante02.imprime();
    }


}