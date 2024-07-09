import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[n+1];
        prime[1] = true;
        
        for(int i=2;i*i<n+1;i++) {
            if (prime[i]) {
                continue;
            }
            for (int j=i*i;j<n+1;j+=i) {
                prime[j]=true;
            }
        }
        for(int i=m;i<=n;i++) {
            if(!prime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}