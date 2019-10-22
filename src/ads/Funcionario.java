package ads;

public class Funcionario {

    private Cargo cargo;
    private double salario;

    public Funcionario(Cargo cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo(){
        return this.cargo;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioComDesconto(){
        return cargo.getRegra().calcula(this);
    }
}
