package Entidades;

public class funcionarioExerc002 {
    
    public String name;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void porcentagemSalario(double porcentagem){
            this.salarioBruto += salarioBruto * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "Funcionario: " + name+ "," + " $ " + salarioLiquido();
    }
}
