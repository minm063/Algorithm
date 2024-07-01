import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] countingArray = new boolean[2001]; // -1000~1000

        for (int i=0;i<n;i++) {
            countingArray[Integer.parseInt(br.readLine())+1000] = true;
        }
        for (int i=0;i<2001;i++) {
            if (countingArray[i]) {
               System.out.println(i-1000);
            }
        }
    }
}