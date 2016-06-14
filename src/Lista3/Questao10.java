package Lista3;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Opções:\nM-matutino\nV-vespertino\nN-noturno\nOpção: "); 
        
        char escolha = sc.next().charAt(0);
        
        switch (escolha) {
            case 'm': case 'M':
                System.out.println("Bom dia!");
                break;
            case 'v': case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'n': case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
        
    }
    
}