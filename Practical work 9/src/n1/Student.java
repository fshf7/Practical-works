package n1;

public class Student {
    int ID;
    String fullName;

    public Student(int ID, String fullName)
    {
        this.fullName = fullName;
        this.ID = ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    public String getFullName() {
        return fullName;
    }

    public String to_string()
    {
        return "ID: " + ID + ";  Name: " + fullName;
    }
}
