import java.io.*;

public class ReadAndWriteUserInput{
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output.txt")) {

            String input;
            while(!(input = br.readLine()).equalsIgnoreCase("exit")){
                fw.write(input + System.lineSeparator());
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
