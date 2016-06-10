package Lista2;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número 01: ");
        
        int n1 = entrada.nextInt();
        
        System.out.print("Digite o número 02: ");
        
        int n2 = entrada.nextInt();
        
        System.out.print("Digite o número 03: ");
        
        float n3 = entrada.nextFloat();
        
        float a = 2 * n1 * n2 / 2;
        
        float b = 3 * n1 + n3;
        
        float c = n3 * n3 * n3;
        
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);
        
        entrada.close();
        
    }
    
}
