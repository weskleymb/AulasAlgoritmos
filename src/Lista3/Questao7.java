package Lista3;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe o número 01: ");
        float n1 = entrada.nextFloat();
        
        System.out.print("Informe o número 02: ");
        float n2 = entrada.nextFloat();
        
        System.out.print("Informe o número 03: ");
        float n3 = entrada.nextFloat();
        float maior = 0, menor = 0;
                     
        if (n1 > n2) {
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }
        
        if (n3 > maior) {
            maior = n3;
        } else if (n3 < menor) {
            menor = n3;
        }
        
        System.out.println ("Maior: " + maior + "\nMenor: "+ menor);
        
    }
    
}
