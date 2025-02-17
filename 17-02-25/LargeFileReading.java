import java.io.*;
public class LargeFileReading {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; 
        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {}
        } catch (IOException e) {
            e.printStackTrace();
        }
        long fileReaderTime = System.nanoTime() - startTime;
        System.out.println("FileReader Time: " + fileReaderTime / 1_000_000.0 + " ms");
        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {}
        } catch (IOException e) {
            e.printStackTrace();
        }
        long inputStreamReaderTime = System.nanoTime() - startTime;
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime / 1_000_000.0 + " ms");
    }
}
