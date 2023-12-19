import java.util.*;

class Solution {
    List<Integer>[] graph;
    int min = Integer.MAX_VALUE;
    
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] wire: wires) {
            int a = wire[0] - 1;
            int b = wire[1] - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for (int[] wire: wires) {
            int a = wire[0] - 1;
            int b = wire[1] - 1;
            
            boolean[] visited = new boolean[n];
            
            graph[a].remove(Integer.valueOf(b));
            graph[b].remove(Integer.valueOf(a));
            
            int cnt = dfs(0, visited);
            
            int diff = Math.abs(cnt - (n - cnt));
            min = Math.min(min, diff);
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        return min;
    }
    
    int dfs(int v, boolean[] visited) {
        int cnt = 1;
        visited[v] = true;
        
        for (int next : graph[v]) {
            if (!visited[next]) {
                cnt += dfs(next, visited);
            }
        }
        
        return cnt;
    }
}