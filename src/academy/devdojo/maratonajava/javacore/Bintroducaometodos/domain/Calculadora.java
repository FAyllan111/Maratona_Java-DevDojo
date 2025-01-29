package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    /*
    metodos => identificador de acesso
    retorno do metodo => retorna alguma coisa, ou nada
    void -> metodo nao retorna nada, tem saida
    nome do metodo -> pascalCase
    metodo com retorno -> retorna variavel e rem que ter o return



     */

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }

    //metodos com parametros
    public void multiplicaDoisNumeros(int num1,int num2){
        System.out.println(num1 * num2);
    }

    // tem que ter o retorno
    public double divideDoisNumeros(double num1, double num2){
        //System.out.println(num1/num2);
        if(num2 ==0){
            return 0;
        }

        return num1/num2;
    }

    //naneira diferente
    public double divideDoisNumeros2(double num1, double num2){
        //System.out.println(num1/num2);
        if(num2 ==0){
            return 0;
        }else {
            return num1 / num2;
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1= 99;
        num2= 69;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num 1: "+num1);
        System.out.println("Num 2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //utilizando as varargs
    //sintaxe = tipo... variavel

    public void somaVarArgs(int... numeros){
        int soma =0;
        for(int num:numeros){
            soma+= num;
        }
        System.out.println(soma);
    }

}

