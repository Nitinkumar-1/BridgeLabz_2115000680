
import java.util.Arrays;
import java.util.Random;
public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random random = new Random();
        for (int size : sizes) {
            int[] data = generateRandomArray(size);
            if (size <= 10000) {
                int[] bubbleData = Arrays.copyOf(data, data.length);
                long startTime = System.nanoTime();
                bubbleSort(bubbleData);
                long bubbleTime = System.nanoTime() - startTime;
                System.out.println("Bubble Sort Time for " + size + " elements: " + bubbleTime / 1_000_000.0 + " ms");
            }
            int[] mergeData = Arrays.copyOf(data, data.length);
            long startTime = System.nanoTime();
            mergeSort(mergeData);
            long mergeTime = System.nanoTime() - startTime;
            System.out.println("Merge Sort Time for " + size + "elements: " + mergeTime / 1_000_000.0 + " ms");
            int[] quickData = Arrays.copyOf(data, data.length);
            startTime = System.nanoTime();
            quickSort(quickData, 0, quickData.length - 1);
            long quickTime = System.nanoTime() - startTime;
            System.out.println("Quick Sort Time for " + size + " elements: " + quickTime / 1_000_000.0 + " ms");
            
            System.out.println("-------------------------------");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }
}
