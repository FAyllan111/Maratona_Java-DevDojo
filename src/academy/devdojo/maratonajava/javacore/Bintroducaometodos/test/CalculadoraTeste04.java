package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do Calculadora 04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " +num2);
        // ao passar variaveis primitivas nunca vão se alterar, o java faz uma copia delas e passa para o metodo, não passa a referencia em memoria da variavel no sistema
    }
}
