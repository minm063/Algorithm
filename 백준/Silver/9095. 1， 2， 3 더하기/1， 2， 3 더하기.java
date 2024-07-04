import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	// 1 -> 1
	// 2 -> 1+1, 2
	// 3 -> 1+1+1, 1+2, 2+1, 3
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[11];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		int n =0;
		for (int i =0;i<T;i++) {
			n = Integer.parseInt(br.readLine());
			for(int j=4;j<=n;j++) {
				arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}

}