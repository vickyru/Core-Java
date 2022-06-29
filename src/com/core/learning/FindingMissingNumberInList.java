package com.core.learning;

        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;
        import java.util.stream.Collectors;

public class FindingMissingNumberInList {
    /**
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
     *
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
     *
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
     */
    public static void main(String[] args) {
        Integer [] nums = {3,0,1};
        List <Integer> numsList = Arrays.asList(nums);
        Set <Integer> numSet= new HashSet<Integer>(numsList);
        for(int i=0; i<=nums.length;i++){
            if(numSet.add(i))
                System.out.println("Missing number " + i);
        }
    }
}
