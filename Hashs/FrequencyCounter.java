package Hashs;
import java.util.*;

public class FrequencyCounter {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to list of pairs
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1, 3};
        int[] nums2 = {5, 5, 5, 5};

        System.out.println("Frequencies for nums1: " + countFrequencies(nums1));
        System.out.println("Frequencies for nums2: " + countFrequencies(nums2));
    }
}
