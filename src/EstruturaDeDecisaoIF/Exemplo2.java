package EstruturaDeDecisaoIF;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int n = sc.nextInt();
        
        if (n > 0) {
            
            System.out.println("NÚMERO POSITIVO");
            
        } else if (n < 0) {
            
            System.out.println("NÚMERO NEGATIVO");
            
        } else {
            
            System.out.println("NÚMERO NEUTRO");
            
        }
        
    }
    
}