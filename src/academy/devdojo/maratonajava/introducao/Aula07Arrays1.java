package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays1 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // inicializando o array ja com os valores
        int[] numeros2 = {2,6,7,9,63};
        int[] numeros3 = new int[]{2,6,7,9,63};

        //iterando sobre o array com o foreach
        //nao acessam os indices, apenas os valores

        for(int i :numeros3){
            System.out.println(i);
        }
        // foreach por baixo dos panos => usa os valores de referencias
        /*
        int i = numeros3[0];
            System.out.println(int);
        int i = numeros3[1];
        System.out.println(int);
        int i = numeros3[2];
        System.out.println(int);
         */
    }
}
