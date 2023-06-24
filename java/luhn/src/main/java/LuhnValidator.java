class LuhnValidator {

    boolean isValid(String candidate) {
        int sum = 0;

        if (candidate.matches(".*[^0-9 ].*"))
            return false;
        candidate = candidate.replaceAll(" ", "");
        if (candidate.length()<=1)
            return false;

        for (int i = candidate.length() - 1; i >= 0; i--) {
            int number;
            sum += candidate.charAt(i) - '0';
            i--;

            if (i >= 0) {
                number = (candidate.charAt(i) - '0') * 2;
                if (number > 9) {
                    number -= 9;
                }
                sum += number;
            }
        }
        return sum % 10 == 0;
    }
}