package Lista4;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o ano: ");
        
        int ano = entrada.nextInt();
        
        if (ano % 4 == 0) {
            
            System.out.println("Ano BISSEXTO!!!");
            
        } else {
            
            System.out.println("Ano não BISSEXTO!!!");
            
        }
        
    }
    
}
