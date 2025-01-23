package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo

        byte diaSemana = 5;

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite um número de 1 a 7");
                break;
        }
    }
}
