package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoExercicios2 {
    public static void main(String[] args) {
        //dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //condição = valor parcela >= 1000
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro/parcela;
            if (valorParcela<1000){
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$: " +valorParcela);
        }
    }
}
