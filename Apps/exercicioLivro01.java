package Apps;
import java.util.Scanner;

import Entidades.accountLivro01;

public class exercicioLivro01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
    
            accountLivro01 myAccount = new accountLivro01();
    
    
            System.out.printf("nome inicial é: %s%n%n", myAccount.getName());
    
    
            System.out.println("Porfavor entre com nome: ");
            String theName = sc.nextLine();
            myAccount.setName(theName);
            System.out.println();
    
    
            System.out.printf("O nome no objeto myAccount é: %s%n%n",myAccount.getName());
    
            sc.close();
        }
    }
    
  