import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    char[] wordToMatchArray;
    String word;

    public Anagram(String word) {
        this.word = word.toLowerCase();
        this.wordToMatchArray = word.toLowerCase().toCharArray();
        Arrays.sort(wordToMatchArray);
    }

    List<String> match(List<String> candidates) {
        List<String> matches = new ArrayList<>();

        for (String s : candidates) {
            char[] wordArray = s.toLowerCase().toCharArray();
            Arrays.sort(wordArray);

            if (Arrays.compare(wordArray, wordToMatchArray) == 0 && (!s.toLowerCase().equals(this.word)))
                matches.add(s);
        }

        return matches;
    }

}