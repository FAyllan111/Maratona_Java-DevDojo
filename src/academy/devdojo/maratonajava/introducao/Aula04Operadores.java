package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos
        System.out.println("Operadores aritméticos:");

        int numero1 = 16;
        int numero2 = 96;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero2 / numero1;
        float restodiv = numero1 % numero2;

        System.out.println("soma:"+soma);
        System.out.println("subtracao:"+subtracao);
        System.out.println("divisao:"+divisao);
        System.out.println("multiplicacao:"+multiplicacao);
        System.out.println("restodiv:"+restodiv);

        // operadores relacionais < > => <= == != -> sempre retornam um booleano (true/false)

        System.out.println("Operadores relacionais :");
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezMaiorOuIgualVinte = 10 >=20;
        boolean isDezMenorOuIgualAVinte = 10 <= 20;

        System.out.println("isDezDiferenteDeVinte:"+isDezDiferenteDeVinte);
        System.out.println("isDezMenorOuIgualAVinte:"+isDezMenorOuIgualAVinte);
        System.out.println("isDezIgualAVinte:"+isDezIgualAVinte);
        System.out.println("isDezMaiorOuIgualVinte:" +isDezMaiorOuIgualVinte);
        System.out.println("isDezMaiorQueVinte:"+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte:"+isDezMenorQueVinte);


        // operadores logicos = && => AND ; || = OR ;  ! = NOT
        System.out.println("Operadores de lógicos:");
        int idade = 58;
        float salario = 3589.69F;

        boolean isDentroDaLei = idade > 30 && salario >= 4612;


        System.out.println("isDentroDaLei : "+isDentroDaLei);

        double contaCorrente = 500;
        double contaPoupanca = 7500;
        float valorPlaystation = 8700F;
        boolean isPlaystationCompravel = contaCorrente > valorPlaystation || contaPoupanca > valorPlaystation;

        System.out.println("Playstation Compravel:" + isPlaystationCompravel);

        // operadores de atribuicao atribui algo a variavel = += -= *= /= %=
        System.out.println("Operadores de atribuição:");

        int bonus = 1000;
        bonus += 1000;
        System.out.println("Bonus:" + bonus);
        bonus -= 1000;
        System.out.println("Bonus:" + bonus);
        bonus *= 10;
        System.out.println("Bonus:" + bonus);
        bonus /= 10;
        System.out.println("Bonus:" + bonus);
        bonus %= 10;
        System.out.println("Bonus:" + bonus);

        //usados para incrementar:
        int contador = 0;
        contador +=1;
        System.out.println(contador);
        contador ++;
        System.out.println(contador);
        contador --;
        System.out.println(contador);

    }
}
