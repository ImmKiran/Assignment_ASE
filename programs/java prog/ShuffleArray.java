import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7 }; // Creating an array with values 1 through 7

        // Converting the array to a list
        List<Integer> list = Arrays.asList(array);

        // Shuffling the list
        Collections.shuffle(list);

        // Converting the shuffled list back to an array
        list.toArray(array);

        // Displaying the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}
