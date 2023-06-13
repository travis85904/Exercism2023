class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int[] values = new int[10];

        //make sure only valid characters are present
        if (stringToVerify.matches(".*[^0-9,X,-].*"))
            return false;

        //remove all hyphens
        stringToVerify = stringToVerify.replaceAll("[^0-9,X]","");

        //make sure ISBN is 10 characters in length
        if (stringToVerify.length() != 10)
            return false;

        //turn chars into numeric values
        for (int i = 0; i < 10; i++) {
           values[i] = Character.getNumericValue(stringToVerify.charAt(i));
        }

        //if the check digit is an 'X' then put 10 for the value
        if (stringToVerify.charAt(9) == 'X')
            values[9] = 10;
        else
            values[9] = Character.getNumericValue(stringToVerify.charAt(9));


        return (values[0] * 10 + values[1] * 9 + values[2] * 8 + values[3] * 7 + values[4] * 6 + values[5] * 5 + values[6] * 4 + values[7] * 3 + values[8] * 2 + values[9] * 1) % 11 == 0;
    }

}
