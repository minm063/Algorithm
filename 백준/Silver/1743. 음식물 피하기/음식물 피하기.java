import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n, m, r, c, answer, temp;
    static boolean[][] visited;
    static boolean[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();

        visited = new boolean[n][m];
        graph = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            r = sc.nextInt();
            c = sc.nextInt();
            graph[r - 1][c - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && graph[i][j]) {
                    temp = 0;
                    dfs(i, j);
                    answer = Math.max(answer, temp);
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int y) {
        temp++;
        visited[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int xx = x + dx[k];
            int yy = y + dy[k];

            if (xx < 0 || yy < 0 || xx >= n || yy >= m) {
                continue;
            }
            if (!visited[xx][yy] && graph[xx][yy]) {
                dfs(xx, yy);
            }
        }
    }
}
