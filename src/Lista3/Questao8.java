package Lista3;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Informe o preço do produto 01: ");
        float n1 = entrada.nextFloat ();
        
        System.out.print("Informe o preço do produto 02: ");
        float n2 = entrada.nextFloat ();
        
        System.out.print("Informe o preço do produto 03: ");
        float menor = n1, n3 = entrada.nextFloat ();
        String produto = "";
                     
        if (n1 <= menor) {
            menor = n1;
            produto = "Produto 1";
        }
        
        if (n2 < menor) {
            menor = n2;
            produto = "Produto 2";
        }
        
        if (n3 < menor ) {
            menor = n3;
            produto = "Produto 3";
        }
        
        System.out.println (produto + ": " + menor);
        
    }
    
}
