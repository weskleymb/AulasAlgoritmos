package Lista1;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        
        double raio = entrada.nextFloat();
        
        double pi = 3.1415926535897932;
        
        double area = pi * raio * raio;
        
        System.out.println("Área do círculo é " + area);
        
    }
    
}
