import java.util.HashMap;
import java.lang.Math;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
           
            if(map.containsKey(nums[i])){
                int diff = Math.abs(i - map.get(nums[i]));
                if(diff <=k)  return true;
                else map.put(nums[i], i);
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}