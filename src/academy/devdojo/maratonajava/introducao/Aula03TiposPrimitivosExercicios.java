package academy.devdojo.maratonajava.introducao;

/*
    PRATICA

    Crie variaveis oara os campos descritos abaixo entre <> e imprima a segunte mensagem

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi meu salário de <salario>, na data <data>

 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Xurupingabilijin";
        String endereco = "Rua ABC, Número 123";
        double salario = 2691.5874; // usando moedas usa o bigdecimal
        String dataRecebimento = "22/01/2025";
        String outroPrint = "Eu " +nome +",morando no endereço " + endereco +", confirmo que recebi meu salario de R$ "+ salario +", na data de " + dataRecebimento ;


        System.out.println("Eu " +nome +",morando no endereço " + endereco +", confirmo que recebi meu salario de R$ "+ salario +", na data de " + dataRecebimento);
        System.out.println("----------------------------------");
        System.out.println(outroPrint);
    }
}
