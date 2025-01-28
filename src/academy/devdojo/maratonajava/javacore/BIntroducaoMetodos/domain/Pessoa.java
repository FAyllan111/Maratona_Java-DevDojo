package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain;

public class Pessoa {
    //private => significa que os atriburos so podem ser modificados dentro da propria objet
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //toda vez que tiver setando tem que colocar o valor do parametro igual da variavel que vai ser pega e o nome da variavel em questão, para fazer o get utiliza-se o tipo de variavel do metodo e nao usa-se parametros

    //para setar => this.variavel = variavel;
    //para get => return this.variavel

    //metodo para acessar os atributos privados

    public void setNome(String nome){
        this.nome = nome; // aqui atribui os valores para a variavel usando o this.
    }
    public void setIdade(int idade){
        if (idade<0){
            System.out.println("idade inválida!");
            return;
        }
        this.idade = idade;// this vem antes da variavel, caso contrario vai retornar os valores padrão
    }
    //agora o metodo para chamar no metodo pois da excçao caso tente acessar
    //utiliza-se o get e nao se usa o metodo void, se utiliza o tipo da variavel que quer retornar pois agora vai ter que ter um retorno ou seja usa o return

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
