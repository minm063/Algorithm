import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st.countTokens());
    }
}