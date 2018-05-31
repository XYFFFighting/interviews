// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

import java.util.ArrayList;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        ArrayList<Integer> toltal = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            toltal.add(nums[i]);
        }
        for(int i = 0; i < toltal.size(); i++){
            first = i;
            if(toltal.contains(target - toltal.get(i))){
                second = toltal.indexOf(target-toltal.get(i));
                break;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, 18);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
