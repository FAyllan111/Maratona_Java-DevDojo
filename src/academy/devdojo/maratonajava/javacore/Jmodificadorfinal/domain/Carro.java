package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;


public final class Carro {
    //para valores que não mudem ou seja constantes => usa-se o final
    private String nome;

    //constantes modo de declarar parecido com o SQL => NOME_DA_CONSTANTE
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
