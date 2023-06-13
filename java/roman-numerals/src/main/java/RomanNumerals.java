import java.util.*;

public class RomanNumerals {
    private int number;
    private NavigableMap<Integer, String> values = new TreeMap<>();
    {
        values.put(1000, "M");
        values.put(900, "CM");
        values.put(500, "D");
        values.put(400, "CD");
        values.put(100, "C");
        values.put(90, "XC");
        values.put(50, "L");
        values.put(40, "XL");
        values.put(10, "X");
        values.put(9, "IX");
        values.put(5, "V");
        values.put(4, "IV");
        values.put(1, "I");
        values = values.descendingMap();
    }

    public RomanNumerals(int number) {
        this.number = number;
    }
    String getRomanNumeral() {
        StringBuilder sb = new StringBuilder();

        for (var entry : values.entrySet()) {
            int currentNumber = entry.getKey();
            String numeral = entry.getValue();

            while (this.number >= currentNumber) {
                sb.append(numeral);
                this.number -= currentNumber;
            }
        }
        return sb.toString();
    }
}