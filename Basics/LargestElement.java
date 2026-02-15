// Problem: Largest Element in an Array
// Source: Striver A2Z - Arrays (Easy)
// Approach: Linear traversal
// Time: O(n), Space: O(1)
import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElementStream {

    public static void main(String[] args) {
        int[] numbers = {55, 32, 45, 98, 82, 11, 9, 39, 50};
        
        OptionalInt maxOptional = Arrays.stream(numbers).max();

        if (maxOptional.isPresent()) {
            int largest = maxOptional.getAsInt();
            System.out.println("The largest element in the array is: " + largest);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
