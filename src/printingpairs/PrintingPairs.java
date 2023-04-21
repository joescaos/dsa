package printingpairs;

public class PrintingPairs {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,12};
        printingPairs(arr);
    }

    public static void printingPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int y = arr[j];
                System.out.println(x + "," + y);
            }
            System.out.println();
        }
    }
}
