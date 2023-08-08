import java.util.HashMap;
import java.util.Map;

public class Cipher {
    Map<String, Integer> offsetMap = createMap();
    String key = "abcdefghijklmnopqrstuvwxyz";

    public Cipher() {
    }

    public Cipher(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public String encode(String plainText) {
        byte[] bytes = plainText.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            try {
                encodeModify(bytes, i);
            } catch (StringIndexOutOfBoundsException e) {
                key += key;
                encodeModify(bytes, i);
            }
        }
        return new String(bytes);
    }

    private void encodeModify(byte[] bytes, int i) {
        int value = offsetMap.get(key.substring(i, i + 1));
        if (bytes[i] + value > 122)
            bytes[i] += (byte) (value - 26);
        else bytes[i] += (byte) value;
    }

    public String decode(String cipherText) {
        byte[] bytes = cipherText.getBytes();
        for (int i = bytes.length - 1; i >= 0; i--) {

            try {
                decodeModify(bytes, i);
            } catch (StringIndexOutOfBoundsException e){
                key += key;
                decodeModify(bytes, i);
            }
        }
        return new String(bytes);
    }

    private void decodeModify(byte[] bytes, int i){
        int value = offsetMap.get(key.substring(i, i + 1));
        if (bytes[i] - value < 97)
            bytes[i] -= (byte) (value - 26);
        else bytes[i] -= (byte) value;
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> myMap = new HashMap<>(25);
        myMap.put("a", 0);
        myMap.put("b", 1);
        myMap.put("c", 2);
        myMap.put("d", 3);
        myMap.put("e", 4);
        myMap.put("f", 5);
        myMap.put("g", 6);
        myMap.put("h", 7);
        myMap.put("i", 8);
        myMap.put("j", 9);
        myMap.put("k", 10);
        myMap.put("l", 11);
        myMap.put("m", 12);
        myMap.put("n", 13);
        myMap.put("o", 14);
        myMap.put("p", 15);
        myMap.put("q", 16);
        myMap.put("r", 17);
        myMap.put("s", 18);
        myMap.put("t", 19);
        myMap.put("u", 20);
        myMap.put("v", 21);
        myMap.put("w", 22);
        myMap.put("x", 23);
        myMap.put("y", 24);
        myMap.put("z", 25);

        return myMap;
    }
}
