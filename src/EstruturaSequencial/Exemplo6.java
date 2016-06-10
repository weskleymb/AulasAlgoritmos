package EstruturaSequencial;

import java.util.Scanner;

public class Exemplo6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nota 01:");
        float n1 = sc.nextFloat();
        
        System.out.println("Nota 02:");
        float n2 = sc.nextFloat();
        
        System.out.println("Nota 03:");
        float n3 = sc.nextFloat();
        
        float m = (n1 * 4 + n2 * 5 + n3 * 6) / 15;
        
        System.out.println("Média Final: " + m);
        
    }
    
}
