import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
                for (int i=0;i<t;i++) {
            String[] line = br.readLine().split(" ");
            sb.setLength(0);
            for (int j=0;j<line[1].length();j++) {
                sb.append(String.valueOf(line[1].charAt(j)).repeat(Integer.parseInt(line[0])));
            }
            System.out.println(sb);
                }
    }
}