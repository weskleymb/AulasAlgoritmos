package EstruturaDeRepeticaoFOR;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        
        int n = entrada.nextInt();
        
        for (int i=0; i<10; i++) {
            
            System.out.println(n + " x " + i + " = " + (n * i));
        
        }
        
    }
    
}
