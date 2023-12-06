import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        
        for (int job : priorities) {
            queue.add(job);
        }
        
        while (!queue.isEmpty()) {
            int max = Collections.max(queue);
            Integer elem = queue.poll();
            
            if (max == elem) {
                ++answer;
                if (location == 0) break;
            } else {
                queue.add(elem);
            }
            
            --location;
            if (location == -1) location = queue.size() - 1;
        }
        
        return answer;
    }
}