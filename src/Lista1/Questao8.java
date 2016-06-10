package Lista1;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor da sua hora: ");
        
        float valor_hora = entrada.nextFloat();
        
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        
        int qtd_horas = entrada.nextInt();
        
        float salario = valor_hora * qtd_horas;
        
        System.out.println("Seu salário é " + salario);
        
    }
    
}
