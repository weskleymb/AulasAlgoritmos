package Lista1;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o lado do quadrado: ");
        
        int lado = entrada.nextInt();
        
        int area = lado * lado;
        
        System.out.println("O dobro da área é " + (2 * area));
        
    }
    
}