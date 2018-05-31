//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.

import java.util.HashMap;

class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>(); //<num, repeatTime>
        for(int num : nums){
            if(map.containsKey(num) && map.get(num) >= nums.length / 2){
                return num;
            }
            else if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement major = new MajorityElement();
        int[] test = new int[]{3,3,3,2,2,2,3};
        System.out.println(major.majorityElement(test));
    }
}
