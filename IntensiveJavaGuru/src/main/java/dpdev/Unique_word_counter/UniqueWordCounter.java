package dpdev.Unique_word_counter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    protected Map<String, Integer> map = new HashMap<>();

    public void addWord(String word){
        if (map.containsKey(word)){
            map.put(word, map.get(word) + 1);
        }
        else map.put(word, 1);
    }

    public String getMostFrequentWord(){
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == Collections.max(map.values()))
                return entry.getKey();
        }
        return "";
    }

    public void printWordsFrequency(){
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
