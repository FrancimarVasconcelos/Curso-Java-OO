package Entidades;

public class retanguloClass001 {
    
    public double AREA;
    public double LARGURA;
   
    public double AREA(){
        return AREA*LARGURA;
    }

    public double LARGURA(){
        return AREA *2 + LARGURA *2;
    }

    public double DIAGONAL(){
        return Math.sqrt(AREA * LARGURA + AREA * LARGURA);
    }
    

}
