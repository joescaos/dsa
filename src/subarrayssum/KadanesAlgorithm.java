package subarrayssum;

public class KadanesAlgorithm {

    public static int kadanesSum(int[] arr) {
        int currentSum = 0;
        int largestSum = 0;
        for (int j : arr) {
            currentSum = currentSum + j;
            if (currentSum < 0) {
                currentSum = 0;
            }
            largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
    }

    public static int kadanesSum2(int[] arr) {
        int currentSum = 0;
        int largestSum = 0;
        for (int j : arr) {
            currentSum = currentSum + j;
           if (currentSum < j ) {
               currentSum = j;
           }
            largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,-8,9,10,11,12};
        long startTime = System.nanoTime();
        System.out.println(kadanesSum(arr));
        long finalTime = System.nanoTime() - startTime;
        System.out.println("Time of execution brute sum: " + finalTime);
        System.out.println(kadanesSum2(arr));
    }
}
