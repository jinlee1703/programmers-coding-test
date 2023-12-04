import java.util.*;
import java.util.stream.*;

public class Solution {
    public List<Integer> solution(int[] arr) {
        Integer[] stack = new Integer[arr.length];
        
        
        int peek = -1;
        for (int i = 0; i < arr.length; i++) {
            if (peek == -1) {
                stack[++peek] = arr[i];
            } else if (stack[peek] != arr[i]) {
                stack[++peek] = arr[i];
            }
        }
        
        stack = Arrays.copyOf(stack, peek + 1);
        
        ArrayList<Integer> answer = new ArrayList<>(Stream.of(stack)
                .collect(Collectors.toList()));
        
        return answer;
    }
}