package Entidades;

public class aprovadosExerc003 {
    
    public double nota1;
    public double nota2;
    public double nota3;

    public double somaDasNotas(){
        return nota1 + nota2 + nota3;
    }

    public double resultadoFinal(){
        if(somaDasNotas() < 60.0){
            return 60.0 - resultadoFinal();
        }else{
            return 0.0;
        }
    }
    
}
