package dpdev.codewars_Oreder;

import java.util.*;

public class Order {
    public static String order(String words) {
        String result = "";
        Map<Integer, String> map = new TreeMap<>();
        if (words.equals("")){
            return "";
        }
        else{
            String[] wordsArray = words.split(" ");
            for (int i = 0; i < wordsArray.length; i++) {
                char[] chars = wordsArray[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    int n = 0;
                    if(Character.isDigit(chars[j])){
                        n = Character.getNumericValue(chars[j]);
                        map.put(n,wordsArray[i]);
                    }
                }
            }
        }
        Set<Map.Entry<Integer, String>> list = map.entrySet();
        StringBuilder str = new StringBuilder();
        list.forEach(s -> str.append(s.getValue() + " "));
        result = str.toString().trim();
        return result;
    }
}
