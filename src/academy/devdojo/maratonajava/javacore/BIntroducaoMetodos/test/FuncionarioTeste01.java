package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.test;
/* Exercicio metodos:

Crie uma classe Funcionário que contenha os seguintes atributos

1.nome
2.idade
3.salario// tres salarios devem ser guardados

crie dois metodos

1.para imprimir os dados
2.para tirar as média dos salários e imprimir o resultado

*/

import academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Micalateia";
        funcionario.idade = 28;
        //funcionario.salario = new double[] {2893.28,5957.69,6484.54};

        funcionario.imprimir();
        System.out.println("-------------------------");
        funcionario.tirarMedias();

    }
}
