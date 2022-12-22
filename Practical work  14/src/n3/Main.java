package n3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String prices = "25.98 USD, 0.004 EU, 44 TJS, 1005 RUB";
        String regexp = "(\\d*\\.\\d*|\\d*)\s(USD|EU|RUB)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(prices);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
