package EstruturaDeDecisaoSWITCH;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        
        int n = entrada.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("JANEIRO");
                break;
            case 2:
                System.out.println("FEVEREIRO");
                break;
            case 3:
                System.out.println("MARÇO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            default:
                System.out.println("OUTRO MÊS");
        }
        
    }
    
}
