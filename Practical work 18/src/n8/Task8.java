package n8;

import java.util.Objects;
import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            System.out.println("try again");
            String key1 = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception e1) {
                System.out.println("no");
            }
        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "/")) {
            throw new Exception( "Key set to slash" );
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        Task8 t = new Task8();
        t.getKey();
    }
}
