package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.setTipo("Tv");
        anime1.setNome("Jojo");
        anime1.setEpisodios(258);

        //metodos para as mesmas coisas so adicioando uma coisinha a mais no final
        anime2.init("Neon Genesis Evangelion","Mangá",25);
        //aplicando a sobrecarga
        anime2.init("Neon Genesis Evangelion","Mangá",25,"Ação/Drama");


        anime1.imprime();
        anime2.imprime();

/*
        System.out.println("Anime 1:");
        System.out.println(anime1.getTipo());
        System.out.println(anime1.getEpisodios());

        System.out.println("Anime 2:");
        System.out.println(anime2.getTipo());
        System.out.println(anime2.getEpisodios());
        */
    }
}
