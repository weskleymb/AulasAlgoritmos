package Lista1;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em Fahrenheit: ");
        
        float f = entrada.nextFloat();
        
        float c = (5 * (f - 32) / 9);
        
        System.out.println("A temperatura em Celcius é " + c);
        
    }
    
}
