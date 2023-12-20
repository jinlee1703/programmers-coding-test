import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        
        for (int elem : scoville) {
            queue.add(elem);
        }
        
        while (queue.peek() < K) {
            if (queue.size() == 1) return -1;
            queue.add(queue.poll() + queue.poll() * 2);
            ++answer;
        }
        
        return answer;
    }
}