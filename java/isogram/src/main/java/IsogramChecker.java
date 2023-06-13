class IsogramChecker {

    boolean isIsogram(String phrase) {
        int[] count = new int[26];
        phrase = phrase.toUpperCase();
        phrase.chars().forEach(c ->
                {
                    if (c > 64 && c < 91)
                        count[c - 65] += 1;
                }
                );
        for (int i = 0; i < 26; i++) {
            if (count[i]>1)
                return false;
        }
        return true;
    }
}
