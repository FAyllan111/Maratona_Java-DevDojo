package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //chamando o metodo
        calculadora.somaDoisNumeros();
        System.out.println("-------------");
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,8);
    }
}
