package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 564");
        endereco.setCep("00193-099");
        Pessoa pessoa = new Pessoa("Takumi");
        //pessoa.setNome("Takumi"); => sem necessidade pois está com um construtor em pessoa.
        pessoa.setCpf("895647");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Hiruzen");
        //funcionario.setNome("Hiruzen"); => sem necessidade pois está com um construtor herdado de pessoa e com o funcionario tambem.
        funcionario.setCpf("654954");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(69826.64);

        //herdado de pessoa
        funcionario.imprime();
        System.out.println("-----------------");
        funcionario.relatorioPagamento();
    }
}
