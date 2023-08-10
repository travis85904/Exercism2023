import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteinList = new ArrayList<>();

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            switch (rnaSequence.substring(i, i + 3)) {
                case "AUG" -> proteinList.add("Methionine");
                case "UUU", "UUC" -> proteinList.add("Phenylalanine");
                case "UUA", "UUG" -> proteinList.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> proteinList.add("Serine");
                case "UAU", "UAC" -> proteinList.add("Tyrosine");
                case "UGU", "UGC" -> proteinList.add("Cysteine");
                case "UGG" -> proteinList.add("Tryptophan");
                case "UAA", "UAG", "UGA" -> {
                    return proteinList;
                }
            }
        }
        return proteinList;
    }
}
