package EstruturaSequencial;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número 1: ");
        float a = sc.nextFloat();
        System.out.print("Informe o número 2: ");
        float b = sc.nextFloat();
        int s = (int) (a + b);
        System.out.println("Resultado: " + s);
    }
}
