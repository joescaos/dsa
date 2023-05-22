package stringcounter;

import java.util.Objects;

public class StringCounter {

    public static void main(String[] args) {
        String letters = "aaabbbcccccddde";
        System.out.println(stringCounter(letters));
    }

    private static String stringCounter(String text) {
        if(Objects.isNull(text) || text.length() == 0) {
            return "";
        }
        char[] textChars = text.toCharArray();
        char previousChar = 0;
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char letter : textChars) {
            if (letter == previousChar) {
                counter++;
            } else {
                if (previousChar != 0) {
                    sb.append(counter).append(previousChar);
                }
                previousChar = letter;
                counter = 1;
            }
        }
        sb.append(counter).append(previousChar);
        return sb.toString();
    }
}
