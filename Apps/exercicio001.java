package Apps;

import java.util.Locale;
import java.util.Scanner;

import Entidades.retanguloClass001;

public class exercicio001 {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
        Scanner sc = new Scanner(System.in);

        retanguloClass001 retangulo = new retanguloClass001();

       System.out.println("Entre com largura e altura do retangolo:");
       System.out.print("Altura:");
        retangulo.AREA = sc.nextDouble();
        System.out.print("Largura:");
        retangulo.LARGURA = sc.nextDouble();
        System.err.println();

        
        System.out.printf("AREA = %.2f%n", retangulo.AREA());
        System.out.printf("PARAMETRO = %.2f%n", retangulo.LARGURA());
        System.out.printf("DIAGONAL =  %.2f%n", retangulo.DIAGONAL());
       sc.close();
    }
}