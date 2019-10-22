package ads;

import static ads.Cargo.*;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario){
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorCento().calcula(funcionario);
        }
        if(DBA.equals(funcionario.getCargo()) ||
                TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteECincoPorCento().calcula(funcionario);
        }
        throw new RuntimeException("cargo invalido");
    }

}
