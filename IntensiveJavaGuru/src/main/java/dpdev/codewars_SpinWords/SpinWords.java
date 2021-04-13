package dpdev.codewars_SpinWords;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 5){
                sb.append(words[i] + " ");
            }
            else{
                StringBuilder reverseWord = new StringBuilder();
                reverseWord.append(words[i]).reverse();
                sb.append(reverseWord.toString() + " ");
            }
        }
        return sb.toString().trim();
    }
}
