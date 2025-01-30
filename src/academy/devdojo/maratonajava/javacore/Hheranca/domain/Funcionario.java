package academy.devdojo.maratonajava.javacore.Hheranca.domain;


public class Funcionario extends Pessoa {
    //private String nome;
    //private String cpf;
    //private String endereco;
    // isso tudo tem na classe pessoa, ja que um funiconario é uma pessoa
    private double salario;

    //construtor com herança

    public Funcionario(String nome){
        super(nome);
    }


    //sobreescrita de metodos

    @Override
    public void imprime() {
        super.imprime();// refere ao objeto "pai", traz o metodo exatamente como esta la na classe pai/mãe
        System.out.println("Salário: " + this.salario);
    }

    //usar coisas da classe pai, usa o protected que acessa dentro do pacote, no caso todas as classes que estiverem dentro do domimain vai está disponivel no codigo
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de R$ :" + this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
