package Lista4;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota 01: ");
        
        float nota1 = entrada.nextFloat();
        
        System.out.print("Digite a nota 02: ");
        
        float nota2 = entrada.nextFloat();
        
        float media = (nota1 + nota2) / 2;
        
        char conceito = '0';
        
        if (media < 0 || media > 10) {
            System.out.println("Média Inválida!");
            System.exit(0);
        } else if (media < 4) {
            conceito = 'E';
        } else if (media < 6) {
            conceito = 'D';
        } else if (media < 7.5f) {
            conceito = 'C';
        } else if (media < 9) {
            conceito = 'B';
        } else {
            conceito = 'A';
        }
        
        switch(conceito) {
            case 'A': case 'B': case 'C':
                System.out.println("APROVADO! -> Conceito: " + conceito);
                break;
            case 'D': case 'E':
                System.out.println("REPROVADO! -> Conceito: " + conceito);
                break;
        }
        
    }
    
}
