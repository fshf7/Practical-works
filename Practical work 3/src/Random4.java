import org.jetbrains.annotations.NotNull;

public class Random4 {
    public static void main(String [] args) {
        int[] array = new int[2];

        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 99) + 10);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if(i>0){
                if (array[i-1]>= array[i]){
                    System.out.println("Not an increasing progression!");
                    break;
                }
            }
            if (i == array.length - 1){
                System.out.println("An increasing progression!");
            }
        }
    }
}
