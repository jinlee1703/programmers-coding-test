class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean answer = dfs(cards1, cards2, 0, 0, goal, 0);
        
        return answer ? "Yes" : "No";
    }
    
    boolean dfs(String[] cards1, String[] cards2, int idx1, int idx2, String[] goal, int goalIdx) {
        if (goalIdx == goal.length) return true;
        
        boolean flag1 = false, flag2 = false;
        if (idx1 < cards1.length && goal[goalIdx].equals(cards1[idx1])) {
            flag1 = dfs(cards1, cards2, idx1 + 1, idx2, goal, goalIdx + 1);
        }
        if (idx2 < cards2.length && goal[goalIdx].equals(cards2[idx2])) {
            flag2 = dfs(cards1, cards2, idx1, idx2 + 1, goal, goalIdx + 1);
        }
        return flag1 || flag2;
    }
}