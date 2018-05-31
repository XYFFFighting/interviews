//Given an array of integers and an integer k, find out whether there are two distinct indices i and 
//j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

import java.util.ArrayList;

class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> toltal = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(toltal.contains(nums[i])){
                if(Math.abs(toltal.lastIndexOf(nums[i]) - i) <= k)
                    return true;
            }
            toltal.add(nums[i]);
        }
        return false;

    }
}


