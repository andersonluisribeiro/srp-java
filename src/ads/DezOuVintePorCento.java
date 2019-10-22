package ads;

public class DezOuVintePorCento implements RegraDeCalculo {
    @Override
    public double calcula(Funcionario funcionario) {
        double salario = funcionario.getSalario();

        if(salario >= 2000){
            return salario * 0.8;
        }
        return salario * 0.90;
    }
}
