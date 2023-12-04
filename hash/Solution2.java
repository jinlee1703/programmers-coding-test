import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int selectCount = nums.length / 2;
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);        
        }
        
        int typeCount = hm.keySet().size();

        return typeCount >= selectCount ? selectCount : typeCount;
    }
}