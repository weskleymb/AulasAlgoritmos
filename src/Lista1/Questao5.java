package Lista1;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a medida em metros: ");
        
        float metros = entrada.nextFloat();
        
        float centimetros = metros * 100;
        
        System.out.println(metros + "m -> " + centimetros + "cm");
        
    }
    
}
