package Lista2;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a área a ser pintada: ");
        
        float area = entrada.nextFloat();
        int qtd_litros = 0;
        
        if (qtd_litros % 6 == 0) {
            qtd_litros = (int) area / 6;
        } else {
            qtd_litros = (int) area / 6 + 1;
        }
        
        System.out.print("1 - Só Latas\n2 - Só Galões\n3 - Melhor Preço\nEscolha uma das opções acima: ");
        
        int escolha = entrada.nextInt();
        int latas = 0, galoes = 0;
        float resto = 0, preco = 0;
        
        switch(escolha) {
            case 1:
                if (qtd_litros < 18) {
                    latas = 1;
                } else if (qtd_litros % 18 == 0) {
                    latas = (int) qtd_litros / 18;
                } else {
                    latas = (int) qtd_litros / 18 + 1; 
                }
                preco = latas * 80;
                break;
            case 2:
                if (qtd_litros < 3.6f) {
                    galoes = 1;
                } else if (qtd_litros % 3.6 == 0) {
                    galoes = (int) (qtd_litros / 3.6f);
                } else {
                    galoes = (int) (qtd_litros / 3.6f + 1);
                }
                preco = galoes * 25;
                break;
            case 3:
                latas = (int) qtd_litros / 18;
                resto = qtd_litros % 18;
                if (resto % 3.6f == 0) {
                    galoes = (int) (resto / 3.6f);
                } else {
                    galoes = (int) (resto / 3.6f + 1);
                }
                preco = latas * 80 + galoes * 25;
                break;
            default:
                System.out.println("Opção Inválida!!!\nRepita a operação!!!");
                System.exit(0);
        }
        
        System.out.println("Latas: " + latas + "\nGalões: " + galoes + "\nPreço: " + preco);
        
        entrada.close();
        
    }
    
}