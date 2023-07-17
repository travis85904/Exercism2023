final class Acronym {
    StringBuilder sb = new StringBuilder();
    Acronym(String phrase) {
        phrase = phrase.toUpperCase().replaceAll("[^A-Z- ]", "");
        String[] words = phrase.split("[ -]");
        for (String s : words) {
            if (s.length() > 0)
                sb.append(s.charAt(0));
        }
    }

    String get() {
        return sb.toString();
    }

}