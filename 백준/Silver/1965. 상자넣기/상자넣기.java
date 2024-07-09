import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] box = new int[n];
        int[] dp = new int[n];
        int max = 1;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0;i<n;i++) {
            box[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {
                if (box[i]>box[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}