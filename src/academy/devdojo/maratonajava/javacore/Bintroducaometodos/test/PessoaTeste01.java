package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos Jhosnson");
        pessoa.setIdade(31);
        //acoplamento -> o quao uma classe esta conectada a outra,sabe da outra , nesse caso pessoa e pesoateste, é ai que entra os modificadores de acesso

        pessoa.imprime();
        //para usar o sout nos atributos privates
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
        
        //o set e o get se referem a aqui onde o set vai setar a variavel que esta sendo atribuida e o get vai retornar o que foi atribuido
    }
}
