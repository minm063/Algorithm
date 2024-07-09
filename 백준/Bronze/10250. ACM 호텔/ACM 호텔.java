import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int h, n;
        
        for (int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());
            
            if (n%h==0) {
                sb.append((h*100)+(n/h)).append("\n");
            } else {
                sb.append(((n%h)*100)+((n/h)+1)).append("\n");
            }
        }
        System.out.print(sb);
    }
}