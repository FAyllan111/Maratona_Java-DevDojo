package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain;
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
    public String nome;
    public byte idade;
    public double[] salario;

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        //System.out.println(this.salario);
        if(salario != null) {
            for (int i = 0; i < salario.length; i++) {
                System.out.println(i + 1 + "°: " + salario[i]);
            }
        }else{
            System.out.println("Digite os valores de salário!");
        }
    }

    //corrigindo e usando o returna
    public void tirarMedias(){
        if(salario == null){
            return ;
        }
        double soma = 0;
        double divisao =0 ;

            for (int j = 0; j<this.salario.length;j++){
                soma += this.salario[j];
                divisao = soma/ salario.length;
        }
        System.out.println("A média de salário dos últimos "+ salario.length +" meses é: "+divisao);
    }

}
