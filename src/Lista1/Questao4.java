package Lista1;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota do 1º bimestre: ");
        
        float nota1 = entrada.nextFloat();
        
        System.out.print("Digite a nota do 2º bimestre: ");
        
        float nota2 = entrada.nextFloat();
        
        System.out.print("Digite a nota do 3º bimestre: ");
        
        float nota3 = entrada.nextFloat();
        
        System.out.print("Digite a nota do 4º bimestre: ");
        
        float nota4 = entrada.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Sua média final é " + media);
        
    }
    
}
