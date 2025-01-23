package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        //declarando...
        // tipo [] nome array
        int[] idades= new int[3]; // inicializando o array

        //atribuir valores
        idades[0] = 21;
        idades[1] = 3;
        idades[2] = 96;

        //acessando os valores individuais
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        
        //iterar para os arrays, percorrer o array
        for (int i = 0; i < idades.length; i++) {
            System.out.println("indice " + i + ": " + idades[i]);
        }
    }
}
