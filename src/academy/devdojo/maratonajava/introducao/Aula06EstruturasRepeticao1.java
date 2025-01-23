package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao1 {
    public static void main(String[] args) {
        // imprima os 25 primeiros numeros de um dado valor, por exemplo 50
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break; // sai do laço
            }
            System.out.println(i);
        }
    }
}
