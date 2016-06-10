package Lista3;

import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o número 01: ");
        
        int n1 = entrada.nextInt();
        
        System.out.print("Insira o número 02: ");
        
        int n2 = entrada.nextInt();
        
        if (n1 > n2) {
            
            System.out.println("Maior: " + n1);
        
        } else if (n1 < n2) {
            
            System.out.println("Maior: " + n2);
        
        } else {
            
            System.out.println("Números Iguais");
        
        }
        
    }

}
