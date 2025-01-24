package academy.devdojo.maratonajava.javacore.Aintroducaoclssses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclssses.domain.Carro;

/*
 Desafio
 Crie uma classe carro com os seguintes atributos

 Nome
 Modelo
 ano
 em seguida crie os dois objetos distintos e imprima seus valores
 */


public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 1986;
        carro1.modelo = "Trueno";
        carro1.nome  = "Toyota";

        carro2.ano  =2005;
        carro2.modelo = "CrossFox";
        carro2.nome = "Volkswagen";

        carro1 = carro2; // fazer a referencia de um objeto para o outro e só se pode fazer com  objetos do mesmo tipo na mesma linha de herança


        System.out.println("Carro :" + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Carro :" + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
