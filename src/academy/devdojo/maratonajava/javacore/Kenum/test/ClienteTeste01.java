package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joaoziim", "PESSOA_FISICA" );
        Cliente cliente2 = new Cliente("Joaoziim", "PESSOA_JURIDICA" );
        Cliente cliente3 = new Cliente("Joaoziim", "pesosa fisica" );
        Cliente cliente4 = new Cliente("Joaoziim", "Pessoa_Juridica" );
        //inconsistencia de dados

    }
}
