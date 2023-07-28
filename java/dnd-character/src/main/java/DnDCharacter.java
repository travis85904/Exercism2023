import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class DnDCharacter {
    int strength = ability(rollDice());
    int dexterity = ability(rollDice());
    int constitution = ability(rollDice());
    int intelligence = ability(rollDice());
    int wisdom = ability(rollDice());
    int charisma = ability(rollDice());
    int hitpoints = modifier(constitution) + 10;

    int ability(List<Integer> scores) {
        List<Integer> sortedScore = new ArrayList<>(scores);
        Collections.sort(sortedScore);
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += sortedScore.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        return new ArrayList<>(Arrays.asList(ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1)));
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }

}
