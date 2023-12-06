import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        
        int queueWeight = 0;
        int time = 0;
        for (int truck : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(truck);
                    queueWeight += truck;
                    ++time;
                    break;
                } else if (queue.size() == bridge_length) {
                    queueWeight -= queue.poll();
                } else {
                    if (queueWeight + truck <= weight) {
                        queue.add(truck);
                        queueWeight += truck;
                        ++time;
                        break;
                    } else {
                        queue.add(0);
                        ++time;
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}