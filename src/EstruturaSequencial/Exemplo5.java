package EstruturaSequencial;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a nota 01:");
        float n1 = sc.nextFloat();
        
        System.out.println("Informe a nota 02:");
        float n2 = sc.nextFloat();
        
        System.out.println("Informe a nota 03:");
        float n3 = sc.nextFloat();
        
        System.out.println("Informe a nota 04:");
        float n4 = sc.nextFloat();
        
        float m = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("Média Final: " + m);
        
    }
    
}