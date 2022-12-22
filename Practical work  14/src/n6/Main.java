package n6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String emails = "user@example.com, root@localhost.dot, myhost@@@com.ru, @my.ru";
        String regexp = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
