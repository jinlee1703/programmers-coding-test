class Solution {
    // n : 구역의 개수
    // m : 롤러의 길이
    // section : 다시 칠해야하는 구역
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int cur = 0;
        for (int s : section) {
            if (cur < s) {
                ++answer;
                cur = s + m - 1;
            }
        }
        
        return answer;
    }
}