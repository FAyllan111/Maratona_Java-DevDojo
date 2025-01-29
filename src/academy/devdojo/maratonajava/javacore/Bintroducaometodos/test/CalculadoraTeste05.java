package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,5,6,9,85};
        calculadora.somaArray(numeros);
        //var args
        calculadora.somaVarArgs(numeros);
        //diferença entre arrays que os varargs podem ser passados como:
        //e no vargrgs nao tem cecessidade de se criar um arrau intermediario para utilizar arrays como metodo

        calculadora.somaVarArgs(1,5,6,9,85);
    }
}
