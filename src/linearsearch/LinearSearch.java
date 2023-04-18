package linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] myArr = {45, 8, 89, 63, 2, 7, 33, 15};

        int result = linearSearch(myArr, 33);

        if ( result != -1) {
            System.out.printf("Number is found at index %s%n", result);
        } else{
            System.out.println("Number not found");
        }

    }

    public static int linearSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
