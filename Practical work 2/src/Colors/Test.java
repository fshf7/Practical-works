package Colors;

public class Test {
    public static void main(String[] args){

        String[] a = { "Red ","Orange ","Yellow ","Green ","Blue ","DarkBlue ","Violet "};

        for (String s : a) {
            System.out.print(s);
        }
        System.out.println();

        int n = a.length;
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }

        for (String s : a) {
            System.out.print(s);
        }
    }
}
