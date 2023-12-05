
class Solution {
    boolean solution(String s) {
        boolean[] stack = new boolean[s.length()];
        int top = -1;
        int leftCount = 0, rightCount = 0;
        
        for (char bracket : s.toCharArray()) {
            if (bracket == '(') {
                ++leftCount;
                stack[++top] = true;
            } else if (bracket == ')') {
                ++rightCount;
                if (top == -1) return false;
                stack[top--] = false;
            }
        }
        
        if (leftCount != rightCount) return false;
        if (top > -1) return false;
        
        return true;
    }
}