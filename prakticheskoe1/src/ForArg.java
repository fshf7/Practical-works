public class ForArg {
    public ForArg(String[] args) {
        for (String arg : args) {
            if (arg.equals("-1")) {
                System.out.println("\nThis is your argument: " + arg);
            }
            else{
                System.out.println("This is not your argument: " + arg);
            }
        }
    }
}
