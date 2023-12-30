import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> mappedByName = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            mappedByName.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for (String[] p : photo) {
            int score = 0;
            
            for (String person : p) {
                score += mappedByName.getOrDefault(person, 0);
            }
            
            answer[idx++] = score;
        }
        
        return answer;
    }
}