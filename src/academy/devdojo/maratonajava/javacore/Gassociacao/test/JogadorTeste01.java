package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Lepé");
    Jogador jogador2 = new Jogador("Marioro");
    Jogador jogador3 = new Jogador("Fuca");

    //guardar os jogadores em um array
    Jogador[] jogadores = {jogador1,jogador2,jogador3};

    //entender essa maneira de fazer o foreach
    for(Jogador jogador : jogadores){
        jogador.imprime();
    }

    }
}
