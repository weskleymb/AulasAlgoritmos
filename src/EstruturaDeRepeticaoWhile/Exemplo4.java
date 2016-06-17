package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            int d = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    d++;
                }
            }
            if (d == 2) {
                System.out.print(i + " ");
            }
        } 
        
    }
    
}
