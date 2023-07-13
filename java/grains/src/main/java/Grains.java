import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) throws IllegalArgumentException{
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        BigInteger desiredSquare = BigInteger.valueOf(2);
        return desiredSquare.pow(square-1);
    }

    BigInteger grainsOnBoard() {
    BigInteger total = BigInteger.valueOf(2);

        return BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
    }

}
