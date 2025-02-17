import java.util.*;
public class DataStructureSearchComparison{
    public static void main(String[] args) {
        int dataSize = 1_000_000;
        int searchValue = new Random().nextInt(dataSize);
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < dataSize; i++) {
            int num = i; 
            arrayList.add(num);
            hashSet.add(num);
            treeSet.add(num);
        }
        long start = System.nanoTime();
        boolean foundInArray = arrayList.contains(searchValue);
        long arrayTime = System.nanoTime() - start;
        start = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(searchValue);
        long hashSetTime = System.nanoTime() - start;
        start = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(searchValue);
        long treeSetTime = System.nanoTime() - start;
        System.out.println("Search Time Comparison:");
        System.out.println("ArrayList (O(N))  : " + arrayTime / 1_000_000.0 + " ms");
        System.out.println("HashSet (O(1))    : " + hashSetTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet (O(log N)): " + treeSetTime / 1_000_000.0 + " ms");
    }
}
