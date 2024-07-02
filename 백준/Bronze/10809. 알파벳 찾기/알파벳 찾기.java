import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] pos = new int[26];
        char start = 'a';
        for (int i = 0; i < 26; i++) {
            if (s.indexOf(start) == -1) {
                pos[i] = -1;
            } else {
                pos[i] = s.indexOf(start);
            }
            start++;
        }

        System.out.println(Arrays.stream(pos).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(" ")));
    }
}