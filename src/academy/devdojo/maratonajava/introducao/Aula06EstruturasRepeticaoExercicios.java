package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoExercicios {
    public static void main(String[] args) {
        // imprioma todos os numeros pares de 0 a 1000000

        double numeros = 1;
        //double divisao = numeros % 2;
        while(numeros <= 1000000){
            if (numeros % 2 == 0) {
                System.out.println("O número a seguir é par: " + numeros);
            }
            numeros++;
        }
    }
}
