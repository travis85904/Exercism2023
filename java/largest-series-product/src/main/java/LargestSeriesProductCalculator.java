class LargestSeriesProductCalculator {
    String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        char[] chars = inputNumber.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > inputNumber.length())
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        long largest = 0;

        for (int i = 0; i < inputNumber.length() - (numberOfDigits - 1); i++) {

            long product = Long.parseLong(inputNumber.substring(i, i + 1));

            for (int j = i + 1; j < i + numberOfDigits; j++) {
                product *= Long.parseLong(inputNumber.substring(j, j + 1));
            }

            if (product > largest)
                largest = product;
        }
        return largest;
    }
}
