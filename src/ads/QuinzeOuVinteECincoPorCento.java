package ads;

public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo {
    @Override
    public double calcula(Funcionario funcionario) {
        double salario = funcionario.getSalario();

        if(salario >= 3000){
            return salario * 0.75;
        }
        return salario * 0.85;
    }
}
