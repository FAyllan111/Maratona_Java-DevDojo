package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public  void imprime(Estudante estudante){
        System.out.println("Nome: "+estudante.nome + " Idade: " + estudante.idade +" Sexo: " + estudante.sexo);
    }
}
