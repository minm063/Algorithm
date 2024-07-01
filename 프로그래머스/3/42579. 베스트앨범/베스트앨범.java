import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Map<Integer, Integer>> maps = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (String genre : genres) {
            maps.put(genre, new HashMap<>());
        }
        for (int i = 0; i < genres.length; i++) {
            maps.get(genres[i]).put(i, plays[i]);
        }
        Map<String, Integer> sumMap = new HashMap<>();
        for (String genre : maps.keySet()) {
           sumMap.put(genre, maps.get(genre).values().stream().mapToInt(n->n).sum());
        }
        List<String> keySet = new ArrayList<>(sumMap.keySet());
        keySet.sort((o1, o2) -> (sumMap.get(o2).compareTo(sumMap.get(o1))));
        for (String key : keySet) {
            Map<Integer, Integer> map = maps.get(key);
            List<Integer> keys = new ArrayList<>(map.keySet());
            keys.sort((o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

            if (keys.size() <= 1) {
                answer.add(keys.get(0));
            } else {
                answer.add(keys.get(0));
                answer.add(keys.get(1));
            }
        }
        return answer.stream().mapToInt(n->n).toArray();
    }
}