package academy.devdojo.maratonajava.javacore.CSobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CSobrecargaMetodos.domain.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        produto1.init("Arroz",26.98,25);
        produto2.init("Teclado",199.68,8,"informatica");
        produto3.init("Garrafa de água",0.0,0,"Utensilios");
        produto4.init("Calendário",-69.4,-25,"Decoração");

        produto1.imprime();
        produto2.imprime();
        produto3.imprime();
        produto4.imprime();

    }
}

