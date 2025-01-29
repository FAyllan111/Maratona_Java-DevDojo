package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        //chamar o metodo de entrada do teclado
        Scanner entrada = new Scanner(System.in);
        //ler os dados do teclado
        System.out.println("Digite seu nome abaixo: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite seu sexo: [M]asculino [F]eminino");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade );
        System.out.println("Sexo: " + sexo);

    }
}
