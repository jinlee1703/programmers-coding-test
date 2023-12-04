import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.add(i);
        }
        
        int day = 0;
        while (!queue.isEmpty()) {
            ++day;
            int deployCount = 0;
            
            while (!queue.isEmpty()) {
                int front = queue.peek();
                
                if (progresses[front] + speeds[front] * day >= 100) {
                    queue.poll();
                    ++deployCount;
                } else {
                    break;
                }
            }
            
            if (deployCount > 0) {
                answer.add(deployCount);
            }
        }
        
        return answer;
    }
}