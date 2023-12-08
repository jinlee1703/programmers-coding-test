import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] array = new String[numbers.length];
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if ("0".equals(array[0]))
            return "0";

        for (String num : array)
            answer += num;

        return answer;
    }
}