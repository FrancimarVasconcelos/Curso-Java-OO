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
        System.out.print("Salario Bruto :");
        funcinario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        funcinario.taxa = sc.nextDouble();
        
        System.out.println(funcinario);
        System.out.println();

        System.err.print("qual porcentagem para aumentar o salário? ");
        Double porcentagem = sc.nextDouble();
        funcinario.porcentagemSalario(porcentagem);

        System.out.print("Atualização de dados: ");
        System.out.println(funcinario);


        sc.close();
    }
}
