package Lista4;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor Hora: ");
        
        float valor_hora = entrada.nextFloat();
        
        System.out.print("Qtd Horas: ");
        
        float qtd_horas = entrada.nextFloat();
        
        float salario_bruto = (valor_hora * qtd_horas);
        
        float ir = 0;
        
        if (salario_bruto <= 900) {
            ir = 0;
        } else if (salario_bruto <= 1500) {
            ir = 0.05f;
        } else if (salario_bruto <= 2500) {
            ir = 0.1f;
        } else {
            ir = 0.2f;
        }
        
        float inss = salario_bruto * 0.1f;
        
        float fgts = salario_bruto * 0.11f;
        
        float total_descontos = inss + salario_bruto * ir;
        
        float salario_liquido = salario_bruto - total_descontos;
        
        System.out.println("Salário bruto: (" + valor_hora + " * " + qtd_horas + ") : " + salario_bruto);
    
        if (ir == 0) {
            System.out.println("(-) IR (Isento) : " + ir);
        } else {
            System.out.println("(-) IR (" + (int) (ir * 100) + "%) : " + (salario_bruto * ir));
        }
        
        System.out.println("(-) INSS (10%) : " + inss);
        
        System.out.println("FGTS (11%) : " + fgts);
        
        System.out.println("Total de descontos : " + total_descontos);
        
        System.out.println("Salário líquido : " + salario_liquido);
    
    }
    
}
