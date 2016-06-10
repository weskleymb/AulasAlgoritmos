package EstruturaSequencial;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite n1: ");
        int a = entrada.nextInt();
        System.out.println("Digite n2: ");
        int b = entrada.nextInt();
        
        int m = (a * b);
        
        System.out.println(a + " x " + b + " = " + m);
        
    }
    
}
