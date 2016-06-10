package EstruturaDeDecisaoIF;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe sua média: ");
        
        float m = entrada.nextFloat();
        
        System.out.print("Informe suas faltas: ");
        
        int f = entrada.nextInt();
        
        if (m>=7 && f<=25) {
            
            System.out.println("Aluno APROVADO");
            
        } else {
            
            System.out.println("Aluno REPROVADO");
            
        }
        
    }
    
}
