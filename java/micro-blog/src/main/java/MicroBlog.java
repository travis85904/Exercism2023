class MicroBlog {
    public String truncate(String input) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int count = 0;

        while (index < input.length() && count < 5){
            int codePoint = input.codePointAt(index);
            sb.appendCodePoint(codePoint);
            index += Character.charCount(codePoint);
            count++;
        }
        return sb.toString();
    }
}
