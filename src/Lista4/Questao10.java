package Lista4;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a nota 01: ");
        float n1 = entrada.nextFloat();
        
        if (n1 < 0 || n1 > 10) {
            System.out.println("Nota Inválida!");
            System.exit(0);
        }
        
        System.out.print("Informe a nota 02: ");
        float n2 = entrada.nextFloat();
        
        if (n2 < 0 || n2 > 10) {
            System.out.println("Nota Inválida!");
            System.exit(0);
        }
        
        System.out.print("Informe a nota 03: ");
        float n3 = entrada.nextFloat();
        
        if (n3 < 0 || n3 > 10) {
            System.out.println("Nota Inválida!");
            System.exit(0);
        }
        
        float media = ((n1 + n2 + n3) / 3);
        
        if (media == 10) {
            System.out.println("Aprovado por distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
        
    }
    
}
