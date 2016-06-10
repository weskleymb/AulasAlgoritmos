package EstruturaDeDecisaoIF;

import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean logado = false;
        
        System.out.print("Login: ");
        
        String login = entrada.next();
        
        System.out.print("Senha: ");
        
        String senha = entrada.next();
        
        if (login.equals("weskley") && senha.equals("12345")) {
            logado = true;
        }
        
        if (!logado) {
            System.out.println("Usuário ou Senha inválidos!");
        } else {
            System.out.println("Usuário LOGADO!!!");
        }
        
    }
    
}
