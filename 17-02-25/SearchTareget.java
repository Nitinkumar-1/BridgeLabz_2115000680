import java.util.Arrays;
import java.util.Random;
public class SearchTarget {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : sizes) {
            int[] data = generateSortedArray(size);
            int target = data[random.nextInt(size)]; 
            long startTime = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - startTime;
            startTime = System.nanoTime();
            binarySearch(data, target);
            long binaryTime = System.nanoTime() - startTime;
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("-------------------------------");
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        arr[0] = new Random().nextInt(10); 
        for (int i = 1; i < size; i++) {
            arr[i] = arr[i - 1] + new Random().nextInt(10) + 1; 
        }
        return arr;
    }
}
