package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private String tipo;
    //validações para esse caso
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";


    public Cliente(String nome, String tipo) {
        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
