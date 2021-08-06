import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContadorVotos{

    private static Set<String> keySet;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException{


        String path = "in.txt";
        Map<String, Integer> candidateVotes = new HashMap<>();

        System.out.println("Counting in progress...");

        Thread.sleep(2000);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();

            while(line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int qtd = Integer.parseInt(fields[1]);

                if(candidateVotes.containsKey(name)){
                    int votes = candidateVotes.get(name);
                    candidateVotes.put(name, qtd + votes);
                }else{
                    candidateVotes.put(name,qtd);
                }
                line = br.readLine();
            }

            for(String candidate : candidateVotes.keySet()){
                System.out.println(candidate + " : " + candidateVotes.get(candidate));
            }

       
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}