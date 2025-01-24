package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //arrays de arrays
        //1,2,3,4 - meses
        //31,28,31,30 - dias
        int[][] dias = new int[3][3];// array multidomensional
        //array 1
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2]= 31;
        //array 2
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2]= 30;
        //a array 3
        dias[2][0] = 30;
        dias[2][1] = 31;
        dias[2][2]= 31;

        System.out.println(dias[0][0]);
        System.out.println(dias[1][1]);
        System.out.println(dias[2][2]);
        
        //iterando sobre todos os elementos
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Dentro do For:"+dias[i][j]);
            }
        }

        //mesmo array com foreach= tipo é um endereço de memoria, arrays de inteiros
        System.out.println("_______________________________________________________");

        for(int[] arrayBase:dias){
            for (int num:arrayBase){
                System.out.println("Dentro do foreach:"+num);
            }
        }
    }
}
