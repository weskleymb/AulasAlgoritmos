package VetoresEMatrizes;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        String nome[] = new String[10];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
            
        }
        
        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println("->" + numeros[i]);
        }
        
    }
    
}
