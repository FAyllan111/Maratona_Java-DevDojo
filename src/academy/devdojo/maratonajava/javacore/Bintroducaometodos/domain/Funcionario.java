package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;
/* Exercicio metodos:

Crie uma classe Funcionário que contenha os seguintes atributos

1.nome
2.idade
3.salario// tres salarios devem ser guardados

crie dois metodos

1.para imprimir os dados
2.para tirar as média dos salários e imprimir o resultado

*/
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    //protegendo os atributos
    private double soma;
    private double divisao;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //System.out.println(this.salario);
        if (salario != null) {
            for (int i = 0; i < salario.length; i++) {
                System.out.println(i + 1 + "°: " + salario[i]);
            }
        } else {
            System.out.println("Digite os valores de salário!");
        }
    }

    //corrigindo e usando o returna
    public void tirarMedias() {
        if (salario == null) {
            return;
        }


        for (int j = 0; j < this.salario.length; j++) {
            this.soma += this.salario[j];
            this.divisao = this.soma / salario.length;
        }
        System.out.println("A média de salário dos últimos " + salario.length + " meses é: " + divisao);
    }

    //agroa criando os metodios get ou set


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public double getDivisao() {
        return divisao;
    }
}
