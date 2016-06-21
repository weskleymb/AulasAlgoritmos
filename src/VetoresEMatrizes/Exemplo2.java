package VetoresEMatrizes;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nomes[] = {"Pedro", "Lucas"};
        int notas[][] = {{2,3,4}, {7,8,9}};
        
//        for (int i = 0; i < 2; i++) {
//            
//            System.out.print("Digite seu nome: ");
//            nomes[i] = entrada.next();
//            
//            for (int j = 0; j < 3; j++) {
//                
//                System.out.print(nomes[i] + ", digite sua nota" + (j+1) + ": ");
//                notas[i][j] = entrada.nextInt();
//                
//            }
//            
//        }
        
   
        for (int[] notas_aluno : notas) {

            float soma = 0;

            for (int nota : notas_aluno) {
                soma += nota;
            }

            float media = soma / 3;

            if (media >= 7) {
                System.out.println(media + " -> APROVADO");
            } else {
                System.out.println(media + " -> REPROVADO");
            }

        }
        
    }
    
}
