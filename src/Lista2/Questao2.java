package Lista2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a sua altura: ");
        
        float altura = entrada.nextFloat();
        
        float peso = (72.7f * altura) - 58;
        
        System.out.println("Peso ideal: " + peso);  
        
        entrada.close();
        
    }
    
}
