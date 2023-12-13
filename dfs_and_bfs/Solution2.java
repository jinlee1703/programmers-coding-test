import java.util.*;

class Position {
    int x, y;
    
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int N, M;
    
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[maps.length - 1].length;
        
        bfs(maps, 0, 0);
        
        return maps[N-1][M-1] != 1 ? maps[N-1][M-1] : -1;
    }
    
    public void bfs(int[][] maps, int x, int y) {
        int cnt = 0;
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y));
        
        while (!queue.isEmpty()) {
            Position p = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (maps[nx][ny] == 0) continue;
                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[p.x][p.y] + 1;
                    queue.add(new Position(nx, ny));
                }
            }
        }
    }
}