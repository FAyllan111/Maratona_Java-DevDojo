package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais2 {
    public static void main(String[] args) {
        double salario = 89000;
        String mensagemDoar= "Eu vou doar 500 reais.";
        String mensagemNaoDoar = "Ainda não tenho condições para doar.";
        String resultado;
        //operador ternario (condicao) ? verdadeiro : falso
        String ternario = salario > 4500 ? mensagemDoar : mensagemNaoDoar;
        //metodo noemal
        if (salario>5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        System.out.println(ternario);

    }
}
