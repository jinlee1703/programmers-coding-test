import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // int commandCount = 0;
        // for (int[] command : commands) {
        // int i = command[0] - 1;
        // int j = command[1] - 1;
        // int k = command[2] - 1;

        // List<Integer> list = new ArrayList<>();

        // for (int x = i; x <= j; x++) {
        // list.add(array[x]);
        // }

        // Collections.sort(list);
        // answer[commandCount++] = list.get(k);
        // }

        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0] - 1;
            int j = commands[x][1];
            int k = commands[x][2] - 1;

            int[] arr = Arrays.copyOfRange(array, i, j);
            Arrays.sort(arr);
            answer[x] = arr[k];
        }

        return answer;
    }
}