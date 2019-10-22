package ads;

import static ads.Cargo.*;

public class Programa {

    public static void main(String args[]){

        Funcionario anderson = new Funcionario(DBA, 100);
        Funcionario maria = new Funcionario(DESENVOLVEDOR, 2000);

        System.out.println("O salário do Anderson é: " + anderson.getSalarioComDesconto());
        System.out.println("O salário da Maria é: " + maria.getSalarioComDesconto());

    }
}
