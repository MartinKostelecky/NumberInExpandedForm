package cz.martinkostelecky;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int num) {
        String numStr = String.valueOf(num);
        StringBuilder outputStr = new StringBuilder();
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > '0' && !numStr.endsWith("0")) {
                outputStr.append(numStr.charAt(i)).append(numStr.substring(i + 1, numStr.length()).replaceAll("[1-9]", "0")).append(" + ");
            } else if (numStr.charAt(i) > '0' && numStr.endsWith("0")) {
                outputStr.append(numStr.charAt(0) + numStr.substring(i + 1, numStr.length()).replaceAll("[1-9]", "0"));
            }
        }
        if (numStr.charAt(numStr.length() - 1) > '0') {
            outputStr.append(numStr.charAt(numStr.length() - 1));
        }
        return outputStr.toString();
    }
}



