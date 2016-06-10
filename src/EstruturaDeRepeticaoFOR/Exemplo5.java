package EstruturaDeRepeticaoFOR;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        
        int f=1, n = entrada.nextInt();
        
        String p = "";
        
        for (int i=n; i>0; i--) {
            
            if (i == 1) {
                p += i;
            } else {
                p += i + " x ";
            }
            
            f *= i;
        
        }
        
        System.out.println(n + "! = " + p + " = " + f);
        
    }
    
}
