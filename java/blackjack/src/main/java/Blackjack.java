import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Blackjack {


    public int parseCard(String card) {
        Map<String, Integer> value = new HashMap<>() {{
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
            put("ten", 10);
            put("jack", 10);
            put("queen", 10);
            put("king", 10);
            put("ace", 11);
        }};
        return value.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        Set<String> tens = new HashSet<>();
        tens.add("ten");
        tens.add("jack");
        tens.add("queen");
        tens.add("king");
        return ((card1.equals("ace") && tens.contains(card2)) || (card2.equals("ace") && tens.contains(card1)));
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore >= 10)
            return "S";
        if (isBlackjack)
            return "W";
        return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore <= 11)
            return "H";
        if (handScore >= 17)
            return "S";
        if (dealerScore >= 7)
            return "H";
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
