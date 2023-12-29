import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> mappedByPlayer = new HashMap<>();
        Map<Integer, String> mappedByRank = new HashMap<>();
        String[] answer = new String[players.length];
        
        for (int i = 1; i <= players.length; i++) {
            mappedByPlayer.put(players[i - 1], i);
            mappedByRank.put(i, players[i - 1]);
        }
        
        for (String calling : callings) {
            int currentRank = mappedByPlayer.get(calling);
            String prevPlayer = mappedByRank.get(currentRank - 1);
            
            // 이전 사람 순위 강등
            mappedByPlayer.put(prevPlayer, currentRank);
            mappedByRank.put(currentRank, prevPlayer);
            
            // 호출된 사람 순위 상승
            mappedByPlayer.put(calling, currentRank - 1);
            mappedByRank.put(currentRank - 1, calling);
        }
        
        for (int i = 1; i <= mappedByRank.size(); i++) {
            answer[i - 1] = mappedByRank.get(i);
        }
        
        return answer;
    }
}