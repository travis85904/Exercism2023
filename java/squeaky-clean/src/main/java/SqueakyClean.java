class SqueakyClean {
    static String clean(String identifier) {

        //convert kebab-case to camelCase
        char[] chars = identifier.toCharArray();
        for (int i = 0; i < identifier.length(); i++) {
            if (chars[i] == '-') {
                chars[i+1] = Character.toUpperCase(chars[i+1]);
                i++;
            }
        }
        identifier = new String(chars);

        identifier = identifier.replaceAll(" ", "_") //replace all spaces with underscores
                .replaceAll("\\p{Cntrl}", "CTRL") //replace control characters with CTRL
                .replaceAll("[α-ω-]","") //remove all lowercase greek letters and hyphens
                .replaceAll("[^\\p{L}_]",""); //remove anything that is not a letter or an underscore

        return identifier;
    }
}
