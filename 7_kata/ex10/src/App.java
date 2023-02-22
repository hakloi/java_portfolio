import java.util.Arrays;

// "ATTGC" --> "TAACG"
// "GTAT" --> "CATA"

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String dna = "ATTGC";
        StringBuilder builder = new StringBuilder();

             for(int i=0;i<dna.length();i++){
                  char c = dna.charAt(i);
                  if(dna.charAt(i) == 'T'){
                      builder.append('A');
                  }
                  if(dna.charAt(i) == 'A'){
                      builder.append('T');
                  }
                  if(dna.charAt(i) == 'C'){
                      builder.append('G');
                  }
                  if(dna.charAt(i) == 'G'){
                      builder.append('C');
                  }   
             }
             System.out.print(builder.toString());
    }
}
