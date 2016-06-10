package Lista2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor da sua hora trabalhada: ");
        
        float ht = entrada.nextFloat();
        
        System.out.print("Informe quantas horas você trabalhou: ");
        
        float qh = entrada.nextFloat();
        
        float a = ht * qh;
        
        float b = a * 0.08f;
        
        float c = a * 0.05f;
        
        float d = a - b - c - a * 0.11f;
        
        System.out.println("Salário Bruto: " + a
            + "\nINSS: " + b
            + "\nSindicato: " + c
            + "\nSalário Líquido: " + d);
        
    }
    
}
