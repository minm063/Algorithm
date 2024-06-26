import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> pokemon = new HashMap<>();
        Integer count;
        for (Integer num : nums) {
            count = pokemon.get(num);
            if (count==null) {
                pokemon.put(num, 1);
            }
            else {
                pokemon.put(num, ++count);
            }
        }
        answer = pokemon.size()>nums.length/2?nums.length/2:pokemon.size();
        return answer;
    }
}