import java.util.HashSet;

class PairWithGivenSum {
    static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8};
        int target = 12;
        System.out.println(hasPairWithSum(arr, target));
    }
}
