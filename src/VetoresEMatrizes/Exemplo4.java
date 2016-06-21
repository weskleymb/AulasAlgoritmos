package VetoresEMatrizes;

public class Exemplo4 {

    public static void main(String[] args) {
        
        String nomes[][] = {{"Weskley", "Bezerra"}, {"Carlos", "Andrade"}};
        
        for (String first[] : nomes) {
            
            for (String last : first) {
                
                System.out.println(last);
                
            }
            
        }
        
    }
    
}
