package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myArr = {10, 12, 23, 35, 36, 41, 55, 69, 73, 78, 84};

        int result = binarySearch(myArr, 9);

        if ( result != -1) {
            System.out.printf("Number is found at index %s%n", result);
        } else{
            System.out.println("Number not found");
        }
    }

    public static int binarySearch(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == number) {
                return middle;
            } else if (arr[middle] > number) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }
}
