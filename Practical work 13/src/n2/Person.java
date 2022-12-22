package n2;

public class Person {
    private String name = "";
    private String secondName = " ";
    private String fatherName = " ";

    public Person(){}
    public Person(String name, String secondName, String fatherName)
    {
        this.name = name;
        this.secondName = " " + secondName;
        this.fatherName = " " + fatherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = " " + secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = " " + fatherName;
    }

    public String to_string()
    {
        return name + secondName + fatherName;
    }
}
