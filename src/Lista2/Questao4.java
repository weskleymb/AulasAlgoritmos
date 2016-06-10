package Lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o peso: ");
        
        float peso = entrada.nextFloat();
        
        float multa = 0;
        
        float excesso = 0;
        
        if (peso > 50) {
            
            excesso = peso - 50;
            
            multa = excesso * 4;
            
        }
        
        System.out.println("Peso: " + peso + "\nExcesso: " + excesso + "\nMulta: " + multa);
        
    }
    
}
