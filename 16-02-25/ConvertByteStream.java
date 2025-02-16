import java.io.*;

public class ConvertByteStream{
    public static void main(String[] args){
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
