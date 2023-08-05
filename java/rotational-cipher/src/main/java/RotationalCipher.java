class RotationalCipher {
    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        byte[] bytes = data.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];

            if (b >= 65 && b <= 90) {
                if (b + shiftKey > 90) {
                    bytes[i] = (byte) ((b + shiftKey) - 26);
                } else
                    bytes[i] += (byte) shiftKey;
            } else if (b >= 97 && b <= 122) {
                if (b + shiftKey > 122) {
                    bytes[i] = (byte) ((b + shiftKey) - 26);
                } else
                    bytes[i] += (byte) shiftKey;
            }
        }
        return new String(bytes);
    }
}
