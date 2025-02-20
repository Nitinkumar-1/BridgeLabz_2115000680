import java.util.*;

public class FrequencyCounter{
    public static Map findFrequency(List list){
        Map frequencyMap = new HashMap();
        for(Object item : list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args){
        List list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Frequency Map: " + findFrequency(list));
    }
}
