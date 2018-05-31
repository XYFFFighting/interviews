//Given an array of integers, find if the array contains any duplicates. Your function should return 
//true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.ArrayList;


class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> toltal = new ArrayList<>();
        for(int num : nums){
            if(toltal.contains(num)){
                return true;
            }
            toltal.add(num);
        }
        return false;

    }
}

