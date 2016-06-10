package Lista3;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Informe o número 01:");
        int n1 = input.nextInt();
        
        System.out.print("Informe o número 02:");
        int n2 = input.nextInt();
        
        System.out.print("Informe o número 03:");
        int n3 = input.nextInt();
        
        int aux = 0;
        
        if (n1<n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        if (n1<n3) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        
        if (n2<n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        
        System.out.println(n1 + ">" + n2 + ">" + n3);
        
        System.out.println(n3 + "<" + n2 + "<" + n1);
    
    }
    
}
