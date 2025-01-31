package academy.devdojo.maratonajava.javacore.Isobreescrita.domain;

public class Anime {
    private String nome;

    //sobrrescrevendo o tostring

    @Override //usa o override para ter certeza que o metodo será sobreescrito
    public String toString(){
        return "Anime " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
