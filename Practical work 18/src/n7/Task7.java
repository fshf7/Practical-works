package n7;

import java.util.Objects;
import java.util.Scanner;

public class Task7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        printDetails( key );
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
        Task7 t = new Task7();
        t.getKey();
    }
}
