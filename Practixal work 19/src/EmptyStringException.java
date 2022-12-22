public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Empty string");
    }
}