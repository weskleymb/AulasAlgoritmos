package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        
        int numero = entrada.nextInt();
        
//        for (int i = 1; i <= numero; i++) {
//            
//            if (numero % i == 0) {
//                
//                contador++;
//                
//            }
//            
//        }

        int contador = 1, divisores = 0;

        while (numero != contador) {
            
            if (numero % contador == 0) {
                
                divisores++;
                
            }
            
            contador++;
            
        }

        
        if (divisores == 2) {
            System.out.println("PRIMO!!!");
        } else {
            System.out.println("NÃO PRIMO!!!");
        }
        
    }
    
}
