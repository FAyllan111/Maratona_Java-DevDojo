package academy.devdojo.maratonajava.introducao;

public class Aula08ArrysMultidimensionais1 {
    public static void main(String[] args) {
        //iniciando os arrays multidimensionais de maneira diferente
      //arrays com tamanhos diferentes

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2]; //array de 2 posicoes
        arrayInt[1]= new int[6]; //array de 6 posicoes
        arrayInt[2] = new int[8]; // array de 8 posicoes
        //tudo isso dentro de um array de 3 posicoes com array sdentro deles de posição diferentes
        //podendo ser inicializado das mesmas maneiras anteriores

        //ou inicializando o array manualmente

        int[][] arrayInt2 = {{0,2},{548,64,884,8478,89},{8,9,1,41,14,5204,40,42,4632,4,5,8}};

        for(int[] arrayBase:arrayInt){
            System.out.println("\n_______________________");
            for(int num: arrayBase){
                System.out.print( num + " ");
            }
        }
        System.out.println("\n---------------- Array inicializado manualmente -----------");
        for(int[] arrayBase:arrayInt2){
            System.out.println("\n_______________________");
            for(int num: arrayBase){
                System.out.print( num + " ");
            }
        }
    }
}
