package academy.devdojo.maratonajava.javacore.Aintroducaoclssses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclssses.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        //new Estudante(); // criando espaço em memoria sem lá sem variavel de referencia
        Estudante estudante = new Estudante();
        //nao necessita atualizar e pode atribuir os valores no padrão e ao mesmo tempo pode modificar os valores padrão

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        //mostr oa valores de atribuição padrao
    }
}
