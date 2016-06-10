package Lista1;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em Celcius: ");
        
        float c = entrada.nextFloat();
        
        float f = c * 9 / 5 + 32;
        
        System.out.println("A temperatura em Fahrenheit é " + f);
        
    }
    
}
