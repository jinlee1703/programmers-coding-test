import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] students = { one(answers), two(answers), three(answers) };
        int max = Math.max(students[0], Math.max(students[1], students[2]));

        for (int i = 0; i < 3; i++) {
            int student = students[i];

            if (student == max) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public int one(int[] answers) {
        int ret = 0, i = 0;

        for (int answer : answers) {
            if (answer == ++i) {
                ++ret;
            }

            if (i == 5) {
                i = 0;
            }
        }
        return ret;
    }

    public int two(int[] answers) {
        int[] pattern = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int ret = 0, i = 0;

        for (int answer : answers) {
            if (answer == pattern[i++]) {
                ++ret;
            }

            if (i == 8) {
                i = 0;
            }
        }

        return ret;
    }

    public int three(int[] answers) {
        int ret = 0;
        int[] pattern = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int i = 0;
        for (int answer : answers) {
            if (answer == pattern[i++]) {
                ++ret;
            }

            if (i == 10) {
                i = 0;
            }
        }
        return ret;
    }
}