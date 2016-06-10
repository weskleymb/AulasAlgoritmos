package Lista2;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do arquivo: ");
        
        float tamanho = entrada.nextFloat();
        
        System.out.print("Informe a sua velocidade: ");
        
        float velocidade = entrada.nextFloat();
        
        float tempo = (tamanho / (velocidade / 8f)) / 60f;
        
        System.out.println("Tempo: " + tempo);
        
    }
    
}
