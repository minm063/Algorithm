import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
                Pattern pattern1 = Pattern.compile("(ayaaya|yeye|woowoo|mama)+");
        Pattern pattern2 = Pattern.compile("^(aya|ye|woo|ma)+?$");
        Matcher matcher = null;

        for (String s : babbling) {
            matcher = pattern1.matcher(s);
            if (!matcher.find()) {
                matcher = pattern2.matcher(s);
                if (matcher.find()) {
                    answer++;
                }
            }
        }

        return answer;
    }
}