
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int arr[][];
	static boolean visit[][];
	static int m, n, k;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			// test case
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			visit = new boolean[m][n];
			
			for(int j=0;j<k;j++) {
				// 배추가 심어져있는 위치
				st=new StringTokenizer(br.readLine(), " ");
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				arr[p1][p2] = 1;
			}
			///
			int count = 0;
			for(int p2=0;p2<n;p2++) {
				for(int p1=0;p1<m;p1++) {
					if(arr[p1][p2]==1 && visit[p1][p2]==false) {
						count++;
						dfs(p1, p2);
					}
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
	public static void dfs(int p1, int p2) {
		int x[] = {-1, 0, 1, 0};
		int y[] = {0, -1, 0, 1};
		
		visit[p1][p2] = true;
		for(int i=0;i<4;i++) {
			int dx = p1+x[i];
			int dy = p2+y[i];
			
			if(dx>=0 && dx<m && dy<n && dy>=0 && visit[dx][dy]==false && arr[dx][dy]==1) {
				dfs(dx, dy);
			}
		}
	}
}
