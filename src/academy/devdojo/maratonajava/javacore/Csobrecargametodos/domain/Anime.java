package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String tipo;
    private String nome;
    private String genero;
    private int episodios;

    //metodos construtoes

    public Anime(){

    }

    //repare que os metodos init e init 2 fazem basicmaente as mesmas coisas, apenas adicionando novos argumentos, nesse caso pode-se utilizar da sobrecarga de metodos

    //o que é sobrecarga => quando utilizo o mesmo nome do metodo para as alterações de quantidade de de parametros ou o tipo dos parametros diferentes, mantendo a visibilidade e os tipos os mesmos
    public void init(String nome,String tipo,int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //sobrecarga
    public void init(String nome,String tipo,int episodios,String genero){
        //evitando de repetir os codigos se chama o metodo dentro do outro
        this.init(nome,tipo,episodios);
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return  this.nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }
}
