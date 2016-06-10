package Lista2;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da área a ser pintada: ");
        
        float area = entrada.nextFloat();
        
        int latas = 0;
        
        int qtd_litros = 0;
        
        if (area % 3 == 0) {
            
            qtd_litros = (int) area / 3;
            
        } else {
            
            qtd_litros = (int) area / 3 + 1;
            
        }
        
        if (qtd_litros < 18) {
            
            latas = 1;
            
        } else {
            
            if (qtd_litros % 18 == 0) {
                
                latas = qtd_litros / 18;
                
            } else {
                
                latas = qtd_litros / 18 + 1;
                
            }
            
        }
        
        float preco = latas * 80;
        
        System.out.println("Latas: " + latas + "\nPreço: " + preco);
        
    }
    
}