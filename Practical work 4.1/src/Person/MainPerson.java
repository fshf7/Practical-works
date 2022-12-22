package Person;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Piter", (byte) 20);
        Person person2 = new Person();

        person1.talk();
        person1.move();
    }
}
