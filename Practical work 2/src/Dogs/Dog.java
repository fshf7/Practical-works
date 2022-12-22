package Dogs;

public class Dog {
    private String nickName;
    private int age;

    public Dog(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
    }



    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public int toHumanAge() {
        return age * 7;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dogs.Dogs.Dog{" +
                "nickName='" + nickName + '\'' +
                ", age=" + toHumanAge() +
                '}';
    }
}
