package dpdev.codewars_Help_the_bookseller;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> map = new TreeMap<>();
        for (String letter : lstOf1stLetter) {
            for (String art : lstOfArt) {
                if (art.startsWith(letter)) {
                    String[] s = art.split(" ");
                    if (map.containsKey(letter)) {
                        Integer sum = map.get(letter) + Integer.valueOf(s[1]);
                        map.put(letter, sum);
                    } else {
                        map.put(letter, Integer.valueOf(s[1]));
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> element : set) {
            sb.append("(" + element.getKey() + " : " + element.getValue() + ") - ");
        }
        return sb.toString().substring(0, sb.toString().length() - 3);
    }
}
