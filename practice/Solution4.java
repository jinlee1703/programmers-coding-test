class Node {
    int x;
    int y;
    
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    Node leftTopPoint;
    Node rightBottomPoint;
    
    public int[] solution(String[] wallpaper) {
        leftTopPoint = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE);
        rightBottomPoint = new Node(0, 0);
        
        for (int i = 0; i < wallpaper.length; i++) {
            String line = wallpaper[i];
            
            for (int j = 0; j < line.length(); j++) {
                String space = line.substring(j, j + 1);
                if (space.equals("#")) {
                    if (leftTopPoint.x > i) leftTopPoint.x = i;
                    if (leftTopPoint.y > j) leftTopPoint.y = j;
                    if (rightBottomPoint.x < i) rightBottomPoint.x = i;
                    if (rightBottomPoint.y < j) rightBottomPoint.y = j;
                }
            }
        }
        
        return new int[]{leftTopPoint.x, leftTopPoint.y, rightBottomPoint.x + 1, rightBottomPoint.y + 1};
    }
}