import java.util.*;

public class InvertMap {
    public static Map invert(Map map) {
        Map inverted = new HashMap();
        for (Object key : map.keySet()) {
            Object value = map.get(key);
            inverted.computeIfAbsent(value, k -> new ArrayList()).add(key);
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        System.out.println("Inverted Map: " + invert(map));
    }
}
