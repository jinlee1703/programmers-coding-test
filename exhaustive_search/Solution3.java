import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<>();
    boolean[] check = new boolean[7];

    public int solution(String numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        for (int number : list) {
            if (isPrime(number))
                ++answer;
        }

        return answer;
    }

    public void dfs(String numbers, String temp, int m) {
        if (temp.length() == m) {
            int num = Integer.parseInt(temp);
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                temp += numbers.charAt(i);
                dfs(numbers, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}