package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    //blocos de inicialização - usado para não necessitar de ficar inserindo os metodos dentrodos construtores eles sempore vao esta iniciados e sempre que criar um objeto ele vai ser inicializado
    //bloco de inicialização statico so inicia uma vez

    static {
        episodios = new int[100];
        for(int i = 0; i<episodios.length;i++){
            episodios[i] = i+1;
        }
    }

    public Anime(){

        for( int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
