package EstruturaDeDecisaoIF;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nota 01:");
        float n1 = sc.nextFloat();
        
        System.out.println("Nota 02:");
        float n2 = sc.nextFloat();
        
        System.out.println("Nota 03:");
        float n3 = sc.nextFloat();
        
        float m = (n1 * 4 + n2 * 5 + n3 * 6) / 15;
        
        if (m < 3) {
            
            System.out.println("Aluno REPROVADO com média " + m);
            
        } else if (m < 7) {
            
            System.out.println("Aluno em 4ª PROVA com média " + m);
            
            System.out.println("Nota 04:");
            
            float n4 = sc.nextFloat();
            
            m = (m + n4) / 2;
            
            if (m >= 5) {
                
                System.out.println("Aluno APROVADO com média " + m);
                
            } else {
                
                System.out.println("Aluno REPROVADO com média " + m);
                
            }
            
        } else {
            
            System.out.println("Aluno APROVADO com média " + m);
            
        }
        
    }
    
}
