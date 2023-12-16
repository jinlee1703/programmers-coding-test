import java.util.*;

class Solution {
    List<String> words = new ArrayList<>();
    String[] alphabets = { "A", "E", "I", "O", "U" };

    public int solution(String word) {
        for (int i = 1; i <= 5; i++) {
            perm("", 0, i);
        }

        Collections.sort(words);

        return words.indexOf(word) + 1;
    }

    public void perm(String str, int depth, int k) {
        if (depth == k) {
            words.add(str);
        } else {
            for (String alphabet : alphabets) {
                perm(str + alphabet, depth + 1, k);
            }
        }
    }
}