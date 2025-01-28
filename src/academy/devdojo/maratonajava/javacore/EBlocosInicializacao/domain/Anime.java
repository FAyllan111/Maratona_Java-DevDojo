package academy.devdojo.maratonajava.javacore.EBlocosInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    //blocos de inicialização - usado para não necessitar de ficar inserindo os metodos dentrodos construtores eles sempore vao esta iniciados e sempre que criar um objeto ele vai ser inicializado
    {
        episodios = new int[100];
        for(int i = 0; i<episodios.length;i++){
            episodios[i] = i+1;
        }
    }

    public Anime(){

        for( int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
