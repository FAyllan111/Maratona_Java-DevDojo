package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Raimundo");
        Professor[] professores = {professor};
        Escola escola = new Escola("Do Profesor",professores);

        escola.imprime();
    }
}
