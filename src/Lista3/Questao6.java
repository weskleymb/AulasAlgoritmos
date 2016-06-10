package Lista3;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe o número 01: ");
        float n1 = entrada.nextFloat ();
        
        System.out.print("Informe o número 02: ");
        float n2 = entrada.nextFloat ();
        
        System.out.print("Informe o número 03: ");
        float maior = 0, n3 = entrada.nextFloat ();
                     
        if (n1 > n2){
            maior = n1;
        }
        
        if (n2 > maior) {
            maior = n2;
        }
        
        if (n3> maior ) {
            maior = n3;
        }
        
        System.out.println ("Maior: " + maior);
    
    }
        
}