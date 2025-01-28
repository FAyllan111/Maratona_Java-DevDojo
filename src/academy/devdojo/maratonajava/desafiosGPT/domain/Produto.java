package academy.devdojo.maratonajava.desafiosGPT.domain;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;

    //imprime os dados do produto
    public void imprime(){
        if (this.nome ==null|| this.nome.equals("Produto Inválido")){
            System.out.println("Produto inválido. Dados não disponíveis");
            System.out.println("______________________________________");
            return;
        }
        System.out.println("Detalhes do produto :");
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: R$ "+this.preco);
        System.out.println("Quantidade no Estoque: " +this.quantidadeEstoque);
        System.out.println("Categoria: " +this.categoria);
        verificarEstoque();
        System.out.println("------------------------------");
    }


    //init 1
    public void init(String nome,double preco,int quantidadeEstoque){
        if(preco < 0 || quantidadeEstoque < 0){
            System.out.println("Erro: Preço ou quantidade no estoque não pode ser zero ou menor!");
            this.nome = "Produto Inválido";
            return;
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    //init 2 com sobrecarga de metodo
    public void init(String nome,double preco,int quantidadeEstoque,String categoria){
        if(preco < 0 || quantidadeEstoque < 0){
            System.out.println("Erro: Preço ou quantidade no estoque não pode ser zero ou menor!");
            this.nome = "Produto Inválido";
            return;
        }
        this.init(nome,preco,quantidadeEstoque);
        this.categoria = categoria;
    }


    private void verificarEstoque(){
        if (this.quantidadeEstoque < 10){
            System.out.println("_________________ATENÇÂO_______________");
            System.out.println("Quantidade de estoque abaixo do minimo, favor realizar reposição do item.");
        }
        if (this.nome == null|| this.nome.equals("Produto Inválido")){
            System.out.println("Produto Inválido. Estoque não será verificado");
        }
    }

    //getters e setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
}
