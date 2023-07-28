import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Allergies {
    int allergyScore;

    public Allergies(int allergy) {
        this.allergyScore = allergy;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (allergen.getScore() & allergyScore) == allergen.getScore();
    }

    List<Allergen> getList() {
        return Arrays.stream(Allergen.values())
                .filter(this::isAllergicTo)
                .toList();
    }
}