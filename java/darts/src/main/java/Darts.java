class Darts {
    int score(double xOfDart, double yOfDart) {
        double coordinatesSquared = Math.abs(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        if (coordinatesSquared <= 1)
            return 10;
        if (coordinatesSquared <= 25)
            return 5;
        if (coordinatesSquared <= 100)
            return 1;
        return 0;
    }
}
