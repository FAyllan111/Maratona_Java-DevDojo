package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        // nao ppode trocar o comprador, no caso a variavel de referencia,mas o valor pode
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Takumi");
        System.out.println(carro.COMPRADOR);



        carro.setNome("BMW");
        //acessando a velocidade limite
        //Carro.VELOCIDADE_LIMITE();
    }
}
