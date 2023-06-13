class Proverb {
    public StringBuilder sb = new StringBuilder();

    Proverb(String[] words) {
        int wordOneIndex = 0;
        int wordTwoIndex = 1;

        while (wordTwoIndex < words.length) {
            sb.append(String.format("For want of a %s the %s was lost.\n", words[wordOneIndex], words[wordTwoIndex]));
            wordOneIndex++;
            wordTwoIndex++;
        }
        if (words.length > 0)
            sb.append(String.format("And all for the want of a %s.", words[0]));
    }

    String recite() {
        return sb.toString();
    }

}
