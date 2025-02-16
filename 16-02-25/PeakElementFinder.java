public class PeakElementFinder {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 6, 4, 2};
        System.out.println("Peak Element: " + findPeakElement(arr)); 
    }
}
