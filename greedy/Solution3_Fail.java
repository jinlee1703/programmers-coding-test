import java.util.*;
import java.util.stream.*;

class Solution {
    Set<String> numbers = new HashSet<>();
    
    public String solution(String number, int k) {
        perm(number, "", new boolean[number.length()], 0, k, 0);
        return Collections.max(numbers);
    }
    
    void perm(String input, String output, boolean[] visited, int depth, int k, int s) {
        if (depth >= input.length() - k) {
            numbers.add(output);
        } else {
            for (int i = s; i < input.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    output += input.charAt(i);
                    perm(input, output, visited, depth + 1, k, i + 1);
                    output = output.substring(0, output.length() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}