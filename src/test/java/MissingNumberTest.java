import org.example.MissingNumber;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class MissingNumberTest {
    @Test
    public void testMissingNumber() {
        MissingNumber mn = new MissingNumber();

        // Test case 1: Normal input
        int[] arr1 = {1, 2, 3, 5, 6};
        List<Integer> expectedOutput1 = List.of(4);
        List<Integer> output1 = mn.MissingNumber(arr1);
        assertEquals(expectedOutput1, output1);

        // Test case 2: Normal input
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        List<Integer> expectedOutput2 = List.of(10);
        List<Integer> output2 = mn.MissingNumber(arr2);
        assertEquals(expectedOutput2, output2);

        // Test case 3: Normal input
        int[] arr3 = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        List<Integer> expectedOutput3 = List.of(4);
        List<Integer> output3 = mn.MissingNumber(arr3);
        assertEquals(expectedOutput3, output3);

        // Test case 4: Normal input
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        List<Integer> expectedOutput4 = List.of();
        List<Integer> output4 = mn.MissingNumber(arr4);
        assertEquals(expectedOutput4, output4);
    }
}

