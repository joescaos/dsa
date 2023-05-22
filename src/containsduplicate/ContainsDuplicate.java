package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicatesBruteForce(int[] arr) {
        //first sort the array
        Arrays.sort(arr);
        // iterate over the whole array
        for (int i = 0; i < arr.length - 1; i++) {
            // validate if the value of the element in the i position
            // is equal to the value of the element in the next posituib
            if(arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }

    public static boolean containsDuplicatesRefactored(int[] arr){
        // create a hashset is a collection of unique values
        HashSet<Integer> numbers = new HashSet<>();
        // iterate over the array
        for (int i = 0; i < arr.length - 1; i++) {
            if(numbers.contains(arr[i])) {
                return true;
            }
            numbers.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 6, 89, 6, 9};
        int[] arr2 = new int[] {1, 3, 6, 89, 8, 9};
        System.out.println(containsDuplicatesBruteForce(arr));
        System.out.println(containsDuplicatesBruteForce(arr2));

        System.out.println();

        System.out.println(containsDuplicatesRefactored(arr2));
        System.out.println(containsDuplicatesRefactored(arr));

    }
}
