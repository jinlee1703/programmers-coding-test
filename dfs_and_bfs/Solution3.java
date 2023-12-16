import java.util.*;

class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    void dfs(String begin, String target, String[] words, int depth) {
        if (begin.equals(target)) {
            answer = depth;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;
                
                int k = 0;
                for (int j = 0; j < begin.length(); j++) {
                    if (begin.charAt(j) != words[i].charAt(j)) ++k;
                }
                
                if (k == 1) {
                    visited[i] = true;
                    dfs(words[i], target, words, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}