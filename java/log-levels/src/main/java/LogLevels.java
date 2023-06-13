public class LogLevels {

    public static String message(String logLine) {
        //get the index of the semicolon
        int colonIndex = logLine.indexOf(":");

        //make a substring of everything that comes after the semicolon
        logLine = logLine.substring(colonIndex + 1);

        //remove all leading and trailing spaces
        return logLine = logLine.trim();
    }

    public static String logLevel(String logLine) {
        //get the index of the closing bracket
        int closingBracketIndex = logLine.indexOf("]");

        //make a substring of logLine for what is between the brackets
        logLine = logLine.substring(1, closingBracketIndex);

        //return a lower case version of the string
        return logLine.toLowerCase();
    }

    public static String reformat(String logLine) {
        //return a formatted verison of logline using the methods implemented in LogLevels
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
