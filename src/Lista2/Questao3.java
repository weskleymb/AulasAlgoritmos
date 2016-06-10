package Lista2;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu sexo: ");

        String sexo = entrada.next();
        
        String sexoEscolhido = "";
        
        switch (sexo) {
            case "M": case "m": case "MASCULINO": case "masculino":
                sexoEscolhido = "m";
                break;
            case "F": case "f": case "FEMININO": case "feminino":
                sexoEscolhido = "f";
                break;
            default:
                System.out.println("Sexo Inválido!!!");
                System.exit(0);
        }
        
        System.out.print("Informe sua altura: ");

        float altura = entrada.nextFloat();

        float pesoIdeal = 0;

        switch(sexoEscolhido) {
           case "m":
               pesoIdeal = (72.7f * altura) - 58;
               break;
           case "f":
               pesoIdeal = (62.1f * altura) - 44.7f;
               break;
        }
        
        System.out.print("Informe seu peso: ");
        
        float peso = entrada.nextFloat();
         
        if (peso < pesoIdeal) {
            
            System.out.println("ATENÇÃO!!!\nVocê está abaixo do peso ideal");
        
        } else if (peso > pesoIdeal) {
            
            System.out.println("ATENÇÃO!!!\nVocê está acima do peso ideal");
        
        } else {
            
            System.out.println("PARABÉNS!!!\nVocê está no peso ideal");
        
        }
        
    }
    
}
