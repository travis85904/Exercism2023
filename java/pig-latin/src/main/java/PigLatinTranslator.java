import java.util.List;

public class PigLatinTranslator {
    final List<Character> vowels = List.of(
            'a', 'e', 'i', 'o', 'u'
    );

    String translate(String word) {
        String[] words = word.split(" ");
        int firstVowelIndex = firstVowelIndex(word);

        if (words.length > 1) {
            return multipleWords(words);
        }
        if (word.length() == 2 && word.indexOf('y') == 1) {
            return consonantAction(word, 1);
        }
        if (vowels.contains(word.charAt(0)) || word.startsWith("yt") || word.startsWith("xr")) {
            return vowelAction(word);
        }

        return consonantAction(word, firstVowelIndex);

    }

    String multipleWords(String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            sb.append(translate(s)).append(" ");
        }
        return sb.toString().trim();
    }

    int firstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i)))
                return i;
        }
        return 0;
    }

    String vowelAction(String word) {
        return word + "ay";
    }

    String consonantAction(String word, int firstVowelIndex) {
        if (firstVowelIndex == 0)
            firstVowelIndex = word.indexOf('y');

        if (word.contains("qu") && word.indexOf('q') < firstVowelIndex) {
            String substring = word.substring(word.indexOf("qu") + 2);
            return substring + word.substring(0, word.indexOf("qu") + 2) + "ay";
        }
        return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
    }

}
