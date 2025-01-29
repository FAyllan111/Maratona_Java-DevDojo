package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String tipo;
    private String nome;
    private String genero;
    private int episodios;
    private String estudio;

    //metodos construtoes => obriga se os metodos vão ter certas classes, meio que como uma base obrigatoria para constrtuir o metodo
    //initiando tudo no construtor, ou seja o metodo init se tornou obsoleto
    public Anime(String nome,String tipo,int episodios,String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;


    }
    //da mesma maneira que existe a sobrecarga de metdoso vai existir tambem a sobrecarga de construtores
    public Anime(String nome,String tipo,int episodios,String genero,String estudio){
        //para chanar o outro construtor chama apenas o this e dentro do proprio consttrutor
        //this chamando construtor é sempre a primeira linha exceutavel
        this(nome,tipo,episodios,genero);
        this.estudio = estudio;
    }

    /*  OBSOLETO POR CONTA QUE JA SE INICIOU O CONSTRUTOR
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
*/
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
