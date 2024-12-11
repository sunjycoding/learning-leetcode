package day022;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 *
 * @author created by sunjy on 12/1/24
 */
public class CheckIfWordOccursAsPrefixAnyWordSentence {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(searchWord)) {
                return (i + 1);
            }
        }
        return -1;
    }

}
