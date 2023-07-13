import java.util.*;

class HighScores {
    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        Collections.sort(sortedScores);
        return sortedScores.get(sortedScores.size() - 1);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        Collections.sort(sortedScores);
        List<Integer> topThree = new ArrayList<>();

        if (sortedScores.size() > 3) {
            for (int i = sortedScores.size() - 1; i > sortedScores.size() - 4; i--) {
                topThree.add(sortedScores.get(i));
            }
        } else {
            Comparator cmp = Collections.reverseOrder();
            sortedScores.sort(cmp);
            return sortedScores;
        }

        return topThree;
    }

}
