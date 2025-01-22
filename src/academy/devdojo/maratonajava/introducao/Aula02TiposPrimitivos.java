package academy.devdojo.maratonajava.introducao;
//atalho criar tudo automatico => psvm
public class Aula02TiposPrimitivos {
    public static void main(String[] args){
          //tipos primitivos => guardam em memoria valores simples
        // int,double,float,char,byte,short,long,boolean
        //variavel convencao primeira minuscula e as demais maiusculs
        // os tamanhos de memoria se mantem os mesmos do estudado no c#
        int idade = 4;
        double dupla = 5695425.598447 ;
        float flutuante = 2586.69F; // utiliza-se o F maiusculo ou L no long
        byte bit = 120;
        short curto = 258;
        long longo = 2384745L;
        boolean boleano = true;
        char caractere = 'm'; // pode usar o asc e unicode tbm

        System.out.println(idade);
        System.out.println(dupla);
        System.out.println(flutuante);
        System.out.println(bit);
        System.out.println(curto);
        System.out.println(longo);
        System.out.println(boleano);
        System.out.println(caractere);

        //casting

        int transformar = (int) 10000000000L; //trandformando um long em int usando (int) e corta bits, forçadamente
        double forcarFloat = (float) 2500.6584700;
        System.out.println(transformar); //printa => 1410065408
        System.out.println(forcarFloat);//printa => 2500.658447265625
        //nos dois casos esta ocorrendo a diminuitção de bits


        // String NÃO é um tipo primitivo e sim um tipo de referencia => é uma classe
        String texto = "Insira Texto Aqui";
        System.out.println(texto);
        //sout => System.out.println();

    }

}
