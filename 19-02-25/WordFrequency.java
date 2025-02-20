import java.util.*;

public class WordFrequency {
    public static Map countWordFrequency(String text) {
        Map map = new HashMap();
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println("Word Frequencies: " + countWordFrequency(text));
    }
}
