package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Neon Genesis Evangelion","Mangá",25,"Ação/Drama","Gimbli");


        //metodos para as mesmas coisas so adicioando uma coisinha a mais no final
        //anime.init("Neon Genesis Evangelion","Mangá",25);
        //aplicando a sobrecarga
       // anime.init("Neon Genesis Evangelion","Mangá",25,"Ação/Drama");


        anime.imprime();


    }
}
