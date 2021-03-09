package dpdev.unique_word_vocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    protected Set<String> vocabulary = new HashSet<>();

    public void addWord(String word) {
        if (word != null && !word.isEmpty()){
            vocabulary.add(word);
        }
    }

    public int getWordsCount() {
       return vocabulary.size();
    }

    public void printVocabulary() {
        vocabulary.stream().forEach(System.out::println);
    }
}
