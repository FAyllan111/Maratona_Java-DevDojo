package academy.devdojo.maratonajava.javacore.BIntroducaoMetodos.domain;

public class Estudante {
        public String nome;
        public int idade;
        public char sexo;

        //this => se refere a algo que está dentro do proprio objeto
        // necessario o this se houver mais de uma variavel local, mas é sermpre aconselhavel colocar o this.
        public void imprime(){
                System.out.println("---------------------");
                System.out.println(this.nome);
                System.out.println(this.idade);
                System.out.println(this.sexo);
        }
}
