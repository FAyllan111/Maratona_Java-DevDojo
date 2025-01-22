package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        System.out.println("IF");
        int idade = 20;
        boolean isAutorizado = idade >= 25;

        if(idade >= 18){
            System.out.println("Maior de idade");
        }

        //usando o operador de negacao
        if(!isAutorizado){
            System.out.println("Utilizando o ! (Não/NOT)");
            System.out.println("!isAurotizado => isAutorizado == false");
        }
        System.out.println("Fora do if");

        System.out.println("ELSE IF");

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
