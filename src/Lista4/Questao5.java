package Lista4;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite os lados: ");
        
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int z = entrada.nextInt();
        
        if (!(x+y>z && x+z>y && y+z>x)) {
            System.out.println("Lados não formam triângulo!!!");
        } else {
            if (x==y && x==z && y==z) {
                System.out.println("Triângulo equilátero!!!");
            } else if (x==y || x==z || y==z) {
                System.out.println("Triângulo isósceles!!!");
            } else {
                System.out.println("Triângulo escaleno!!!");
            }
        }
        
    }
    
}