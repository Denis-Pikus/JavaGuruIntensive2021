package dpdev.homework_phrase_analyser;

public class PhraseAnalyser {

    public String analyse(String text) {
        if (text.startsWith("Make") && text.contains("great again"))
            return "It stands no chance";
        if (text.startsWith("Make") || text.contains("great again"))
            return "It could be worse";
        else return "It is fine, really";
    }
}
