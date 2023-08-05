public class Queen {
    private int x, y;

    public Queen(int x, int y) {
        if (x < 0)
            throw new IllegalArgumentException("Queen position must have positive row.");
        if (x > 7)
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        if (y < 0)
            throw new IllegalArgumentException("Queen position must have positive column.");
        if (y > 7)
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
