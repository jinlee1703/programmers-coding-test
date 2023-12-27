import java.util.*;

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int N, M;
    int[] dx = { -1, 1, 0, 0 };
    int[] dy = { 0, 0, -1, 1 };

    public int solution(int[][] land) {
        N = land.length;
        M = land[0].length;
        int answer = 0;

        for (int i = 0; i < M; i++) {
            boolean[][] visited = new boolean[N][M];
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                if (land[j][i] == 1 && !visited[j][i]) {
                    cnt += bfs(j, i, land, visited);
                }
            }

            System.out.println("i: " + i);
            System.out.println("a:" + answer);
            System.out.println("c:" + cnt);
            System.out.println();
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    int bfs(int x, int y, int[][] land, boolean[][] visited) {
        Queue<Node> queue = new LinkedList<>();

        visited[x][y] = true;
        queue.offer(new Node(x, y));
        int cnt = 1;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (land[nx][ny] == 0) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.offer(new Node(nx, ny));
                ++cnt;
            }
        }

        return cnt;
    }
}