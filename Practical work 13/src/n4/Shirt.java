package n4;

public class Shirt {
    private String article;
    private String name;
    private String color;
    private String size;
    private String[] str;

    public Shirt(String str)
    {
        this.str = str.split(",");
        this.article = this.str[0];
        this.name = this.str[1];
        this.color = this.str[2];
        this.size = this.str[3];
    }

    public String to_string()
    {
        return article + '\n' + name + '\n' + color + '\n' + size;
    }
}
