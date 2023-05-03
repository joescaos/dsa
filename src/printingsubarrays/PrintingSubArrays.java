package printingsubarrays;

public class PrintingSubArrays {
    
    public static void printingSubArrays(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,12};
        printingSubArrays(arr);
    }
}
