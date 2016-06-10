package Lista3;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe uma letra do alfabeto: ");
        
        String letra = entrada.next();
        
        if (letra.equalsIgnoreCase("a") || 
            letra.equalsIgnoreCase("e") || 
            letra.equalsIgnoreCase("i") || 
            letra.equalsIgnoreCase("o") || 
            letra.equalsIgnoreCase("u")) {
            
            System.out.println("A letra informada é uma vogal!");
    
        } else {

            System.out.println("A letra informada é uma consoante!");
            
        }

    }
    
}