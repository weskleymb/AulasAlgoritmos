package Lista4;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o seu salário: ");
        
        float salario = entrada.nextFloat();
        
        float aumento = 0;
        
        if (salario <= 280) {
            aumento = 0.2f;
        } else if (salario <= 700) {
            aumento = 0.15f;
        } else if (salario <= 1500) {
            aumento = 0.1f;
        } else {
            aumento = 0.05f;
        }
        
        System.out.println("Salário anterior: " + salario);
        System.out.println("Percentual de aumento: " + (int) (aumento*100) + "%");
        System.out.println("Valor do aumento: " + (salario * aumento));
        System.out.println("Salário atual: " + (salario * (1 + aumento)));
        
    }
    
}
