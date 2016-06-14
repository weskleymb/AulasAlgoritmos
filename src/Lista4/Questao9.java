package Lista4;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        
        int numero = entrada.nextInt();
        
        if (numero >= 1000) {
            System.out.println("Digite um numero menor que 1000\nRepita!!!");
            System.exit(0);
        } else {
            int centenas = (int) (numero / 100);
            int resto = numero % 100;
            int dezenas = (int) (resto / 10);
            resto = resto % 10;
            int unidades = resto;            
            System.out.println("Centenas: " + centenas
                + "\nDezenas: " + dezenas
                + "\nUnidades: " + unidades);
        }
        
        
        
    }
    
}
