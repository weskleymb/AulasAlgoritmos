package Lista1;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite número 1: ");
        
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite número 2: ");
        
        int numero2 = entrada.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("Resultado da soma é " + resultado);
        
    }
    
}
