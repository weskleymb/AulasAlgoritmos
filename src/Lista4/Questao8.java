package Lista4;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Questao8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
//        System.out.print("Digite dia: ");
//        
//        int dia = entrada.nextInt();
//        
//        System.out.print("Digite o mês: ");
//        
//        int mes = entrada.nextInt();
//        
//        System.out.print("Digite o ano: ");
//        
//        int ano = entrada.nextInt();

        System.out.print("Informe a data: ");
        
        String data = entrada.next();
        
        String data_quebrada[] = data.split(Pattern.quote("/"));
        
        int dia = parseInt(data_quebrada[0]);
        
        int mes = parseInt(data_quebrada[1]);
        
        int ano = parseInt(data_quebrada[2]);
        
        if (dia < 1 || mes < 1 || mes > 12) {
            System.out.println("Data Inválida\nRepita a operação");
            System.exit(0);
        } else {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia > 31) {
                        System.out.println("Data Inválida!!!\nRepita a operação!!!");
                        System.exit(0);
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia > 30) {
                        System.out.println("Data Inválida!!!\nRepita a operação!!!");
                        System.exit(0);
                    }
                    break;
                case 2:
                    if (ano % 4 == 0) {
                        if (dia > 29) {
                            System.out.println("Data Inválida!!!\nRepita a operação!!!");
                            System.exit(0);
                        }
                    } else {        
                        if (dia > 28) {
                            System.out.println("Data Inválida!!!\nRepita a operação!!!");
                            System.exit(0);
                        }
                    }
                    break;
            }
        }
        
        System.out.println("Data Válida!!!");
    
    }

}
