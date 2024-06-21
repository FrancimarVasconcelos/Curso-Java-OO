package Apps;

import java.util.Locale;
import java.util.Scanner;

import Entidades.aprovadosExerc003;

public class aprovadosAppEx003 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        aprovadosExerc003 aprovado = new aprovadosExerc003();

        System.out.println("Entrada:");
        System.out.println("---------------------------");
        String nome = sc.nextLine();
        aprovado.nota1 = sc.nextDouble();
        aprovado.nota2 = sc.nextDouble();
        aprovado.nota3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n",aprovado.somaDasNotas());

        System.out.println();
        System.out.println("Saída");
        System.out.println("----------------------------");

        if(aprovado.resultadoFinal() < 60.0){
            System.out.println("REPROVADO");
            System.out.printf("Faltam %.2f pontos%n", aprovado.resultadoFinal());
        }else{
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
