package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Audi",275);
        Carro c2 = new Carro("Mercedes",280);
        Carro c3 = new Carro("BMW",290);

        //modificador estatico
        Carro.setVelocidadeLimite(170);
        //codigo agora pertence a classe nao tem necessidade de se instanciar

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
