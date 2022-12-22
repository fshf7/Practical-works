package n2;

public class Student {
    int sum;
    String fullName;

    public Student(int sum, String fullName)
    {
        this.fullName = fullName;
        this.sum = sum;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setID(int ID) {
        this.sum = ID;
    }

    public int getID() {
        return sum;
    }
    public String getFullName() {
        return fullName;
    }

    public String to_string()
    {
        return "Sum: " + sum + ";  Name: " + fullName;
    }
}
