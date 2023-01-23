package org.example;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static List<Integer> MissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int index = Math.abs(arr[i]);
            if (arr[index - 1] > 0) {
                arr[index -1] *= -1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
//Runtime is (O)n a loop because at the worst case scenario we have to loop through the entire list
//Space is (1) no additional data structures are created