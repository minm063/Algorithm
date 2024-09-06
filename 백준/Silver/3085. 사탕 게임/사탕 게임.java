import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {

	static char[][] board;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		board = new char[N][N];
		
		
		// 보드에 사탕 채워넣기
		for (int i=0;i<N;i++) {
			int cnt=0;
			char temps[] = br.readLine().toCharArray();
			for(char temp: temps) {
				board[i][cnt++] = temp;
			}
		}
				
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if (i+1<N && board[i][j]!=(board[i+1][j])) {
					swap(i, j, i+1, j);
					answer = Math.max(answer, countCandy());
					swap(i, j, i+1, j); // swap 복구
				}
				if (j+1<N && board[i][j]!=board[i][j+1]) {
					swap(i, j, i, j+1);
					// 같은 색 길이
					answer = Math.max(answer, countCandy());
					swap(i, j, i, j+1);
				}
			}
		}
		System.out.println(answer);
	}
	
	private static void swap(int x1, int y1, int x2, int y2) {
		char temp = board[x1][y1];
		board[x1][y1] = board[x2][y2];
		board[x2][y2] = temp;
	}
	private static int countCandy() {
		int count = 1;
		
		for(int i=0;i<board.length;i++) {
			int temp=1;
			for(int j=1;j<board.length;j++) {
				if(board[i][j]==board[i][j-1]) {
					temp++;
				}
				else {
					temp = 1;
				}
				count = Math.max(count, temp);
			}
		}
		
		for(int i=0;i<board.length;i++) {
			int temp=1;
			for(int j=1;j<board.length;j++) {
				if(board[j][i]==board[j-1][i]) {
					temp++;
				}
				else {
					temp = 1;
				}
				count = Math.max(count, temp);
			}
		}
		return count;
	}

}
