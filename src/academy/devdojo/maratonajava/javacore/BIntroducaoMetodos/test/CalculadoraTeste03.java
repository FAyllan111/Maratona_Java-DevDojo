package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // para metodos que tem resultado tem que se usar as atribuiçoes de variaveis com o mesmo tipo do metodo ou fazer o casting, como se tivesse criando uma variavel para retornar ao chamar o metodo

        double resultado = calculadora.divideDoisNumeros(1,0);
        double resultado2 = calculadora.divideDoisNumeros2(1,0);
        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
