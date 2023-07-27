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
    int hitpoints = ability(rollDice());


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
        List<Integer> dice = new ArrayList<>(Arrays.asList(ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1), ThreadLocalRandom.current().nextInt(1, 6 + 1)));
        return dice;
    }

    int modifier(int input) {
        double a = (double) (input - 10) / 2;
        return (int) Math.floor(a);
    }

    int getStrength() {
        return strength;
        //return ability(rollDice());
    }

    int getDexterity() {
        return dexterity;
       // return ability(rollDice());
    }

    int getConstitution() {
        return constitution;
        //return ability(rollDice());
    }

    int getIntelligence() {
        return intelligence;
        //return ability(rollDice());
    }

    int getWisdom() {
        return wisdom;
        //return ability(rollDice());
    }

    int getCharisma() {
        return charisma;
        //return ability(rollDice());
    }

    int getHitpoints() {
        return hitpoints;
        //return ability(rollDice());
    }

}
