import java.util.LinkedList;

class CustomHashMap {
    private static final int SIZE = 1000;
    private LinkedList<Entry>[] map;

    static class Entry {
        int key, value;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        map = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (map[index] == null) {
            map[index] = new LinkedList<>();
        }
        for (Entry entry : map[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        map[index].add(new Entry(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        if (map[index] != null) {
            for (Entry entry : map[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        if (map[index] != null) {
            map[index].removeIf(entry -> entry.key == key);
        }
    }

    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 30);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }
}
