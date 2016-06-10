package Lista3;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um numero: "); 
        
        int n = sc.nextInt();
        
        if(n > 0){
            
            System.out.println("O número é positivo"); 
            
        } else if(n < 0) {
            
            System.out.println("O número é negativo");   
            
        } else {
            
            System.out.println("O numero é neutro"); 
            
        }    
        
    }
    
}
