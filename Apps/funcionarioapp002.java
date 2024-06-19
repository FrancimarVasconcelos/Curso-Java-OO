package Apps;

import java.util.Locale;
import java.util.Scanner;

import Entidades.funcionarioExerc002;

public class funcionarioapp002 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        funcionarioExerc002 funcinario = new funcionarioExerc002();

        System.out.print("Nome: ");
        funcinario.name = sc.nextLine();
        System.out.println("Salario Bruto :");
        funcinario.salarioBruto = sc.nextDouble();
        System.out.println("Taxa: ");
        funcinario.taxa = sc.nextDouble();

        System.out.println(funcinario);


        sc.close();
    }
}
