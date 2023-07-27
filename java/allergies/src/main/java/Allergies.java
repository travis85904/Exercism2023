import java.util.ArrayList;
import java.util.List;

class Allergies {
    int allergyScore;
    List<Allergen> allergenList = new ArrayList<>();

    public Allergies(int allergy) {
        this.allergyScore = allergy;
    }

    boolean isAllergicTo(Allergen allergen) {
        int tempScore = allergyScore;

        while (tempScore > 0) {
            if (tempScore >= 128) {
                tempScore -= 128;
                if (allergen.equals(Allergen.CATS)) {
                    return true;
                }
            }
            if (tempScore >= 64) {
                tempScore -= 64;
                if (allergen.equals(Allergen.POLLEN)) {
                    return true;
                }
            }
            if (tempScore >= 32) {
                tempScore -= 32;
                if (allergen.equals(Allergen.CHOCOLATE)) {
                    return true;
                }
            }
            if (tempScore >= 16) {
                tempScore -= 16;
                if (allergen.equals(Allergen.TOMATOES)) {
                    return true;
                }
            }
            if (tempScore >= 8) {
                tempScore -= 8;
                if (allergen.equals(Allergen.STRAWBERRIES)) {
                    return true;
                }
            }
            if (tempScore >= 4) {
                tempScore -= 4;
                if (allergen.equals(Allergen.SHELLFISH)) {
                    return true;
                }
            }
            if (tempScore >= 2) {
                tempScore -= 2;
                if (allergen.equals(Allergen.PEANUTS)) {
                    return true;
                }
            }
            if (tempScore >= 1) {
                tempScore -= 1;
                if (allergen.equals(Allergen.EGGS)) {
                    return true;
                }
            }
        }
        return false;
    }

    List<Allergen> getList() {
        int tempScore = allergyScore;

        while (tempScore > 0) {
            switch ((tempScore & (-tempScore))) {
                case 1 -> {
                    allergenList.add(Allergen.EGGS);
                    tempScore -= 1;
                }
                case 2 -> {
                    allergenList.add(Allergen.PEANUTS);
                    tempScore -= 2;
                }
                case 4 -> {
                    allergenList.add(Allergen.SHELLFISH);
                    tempScore -= 4;
                }
                case 8 -> {
                    allergenList.add(Allergen.STRAWBERRIES);
                    tempScore -= 8;
                }
                case 16 -> {
                    allergenList.add(Allergen.TOMATOES);
                    tempScore -= 16;
                }
                case 32 -> {
                    allergenList.add(Allergen.CHOCOLATE);
                    tempScore -= 32;
                }
                case 64 -> {
                    allergenList.add(Allergen.POLLEN);
                    tempScore -= 64;
                }
                case 128 -> {
                    allergenList.add(Allergen.CATS);
                    tempScore -= 128;
                }
                default -> tempScore = 0;
            }
        }
        return allergenList;
    }
}