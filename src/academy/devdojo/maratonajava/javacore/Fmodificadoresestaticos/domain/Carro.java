package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    //modificadores estatico fala que pertencem a classe inteira não apenas os objetos criados individualmente, no caso aqui a mesma velocidade limite será para todos os carros sendo modificados tambem depois

    // setornou um metadado, pertencente a todos

    public Carro(String nome,double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Vel. Máxima: "+ this.velocidadeMaxima);
        System.out.println("Vel. Limite: "+ Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //metodos estaticos

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
}
