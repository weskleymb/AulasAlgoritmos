package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String resposta = "nao";
        
        int contador = 0;
        
        while (!resposta.equalsIgnoreCase("sim")) {
            
            System.out.print("Eu sou bonito? ");
            
            resposta = entrada.next();
            
            contador++;
            
        }
        
        System.out.println("Parabéns!!! Você fez "
                + "uma boa escolha em " + contador + " tentativa(s)");
        
    }
    
}
