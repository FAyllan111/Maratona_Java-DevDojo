package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos");

        //atribuindo o time ao jogador
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
