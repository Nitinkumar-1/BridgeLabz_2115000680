import java.util.*;

public class MergeMaps {
    public static Map mergeMaps(Map map1, Map map2) {
        Map result = new HashMap(map1);
        for (Object key : map2.keySet()) {
            result.put(key, result.getOrDefault(key, 0) + (int) map2.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("A", 1);
        map1.put("B", 2);

        Map map2 = new HashMap();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Merged Map: " + mergeMaps(map1, map2));
    }
}
