import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> queue = new ArrayList<>();

        for (String op : operations) {
            String cmd = op.split(" ")[0];
            Integer num = Integer.parseInt(op.split(" ")[1]);

            if ("I".equals(cmd)) {
                queue.add(num);
                Collections.sort(queue, Collections.reverseOrder());
            } else if (queue.size() > 0 && "D".equals(cmd) && num.equals(1)) {
                queue.remove(0);
            } else if (queue.size() > 0 && "D".equals(cmd) && num.equals(-1)) {
                queue.remove(queue.size() - 1);
            }
        }

        int max = queue.size() == 0 ? 0 : queue.get(0);
        int min = queue.size() == 0 ? 0 : queue.get(queue.size() - 1);
        return new int[] { max, min };
    }
}