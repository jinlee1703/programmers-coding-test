import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hm = new HashMap<>();
        
        for (String[] c : clothes) {
            hm.put(c[1], hm.getOrDefault(c[1], 0) + 1); 
        }
        
        for (String key : hm.keySet()) {
            answer *= hm.get(key) + 1;
        }
        
        return answer - 1;
    }
}