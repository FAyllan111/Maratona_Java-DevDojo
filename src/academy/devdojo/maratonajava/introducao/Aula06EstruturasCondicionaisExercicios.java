package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        /* dado um determinado salario me retorne o valor a se pago de imposto
            se for entre 0 e 34712 => 9,7%
            entre 34172 e 66507 => 37,55%
            acima de 66507 = 49,3%
         */
        double salarioMensal = 5817;
        double salario = salarioMensal * 12;
        double imposto ;
        if (salario > 34712){
            imposto = salario * 0.097;
        }else if(salario >= 34172 && salario < 66507 ){
            imposto = salario * 0.3755;
        }else{
            imposto = salario * 0.493;
        }

        System.out.println(imposto);
    }
}

