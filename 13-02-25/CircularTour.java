class CircularTour {
    static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0, total = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            total += petrol[i] - distance[i];
            if (total < 0) {
                start = i + 1;
                deficit += total;
                total = 0;
            }
        }
        return (total + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        System.out.println(findStartingPoint(petrol, distance));
    }
}
