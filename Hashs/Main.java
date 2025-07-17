package Hashs;
import java.util.*;

class Solution {
    public int mostFrequentElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find max frequency and smallest number with that frequency
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                result = num;
            } else if (freq == maxFreq) {
                result = Math.min(result, num); // choose smaller one in case of tie
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        // Sample inputs from the problem
        int[] arr1 = {1, 2, 2, 3, 3, 3};
        int[] arr2 = {4, 4, 5, 5, 6};

        Solution sol = new Solution();

        int output1 = sol.mostFrequentElement(arr1);
        int output2 = sol.mostFrequentElement(arr2);

        // Expected Output
        System.out.println("Input: [1, 2, 2, 3, 3, 3]");
        System.out.println("Output: " + output1);
        System.out.println("Explanation: The number 3 appears the most (3 times).");

        System.out.println();

        System.out.println("Input: [4, 4, 5, 5, 6]");
        System.out.println("Output: " + output2);
        System.out.println("Explanation: Both 4 and 5 appear twice, but 4 is smaller.");
    }
}
