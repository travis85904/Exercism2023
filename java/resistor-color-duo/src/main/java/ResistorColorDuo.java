import java.util.List;
class ResistorColorDuo {
    private List<String> colorList = List.of(
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    );
    int value(String[] colors) {
        String value = String.valueOf(colorList.indexOf(colors[0])) + colorList.indexOf(colors[1]);

        return Integer.parseInt(value);
    }
}
