package n3;

public class Address {
    private String Country;
    private String Region;
    private String City;
    private String Street;
    private String House;
    private String Struct;
    private String Flat;
    private String[] str;


    public Address (String adress)
    {
        this.str = adress.split(", ");
        this.Country = this.str[0];
        this.Region = " " + this.str[1];
        this.City = " " + this.str[2];
        this.Street = " " + this.str[3];
        this.House = " " + this.str[4];
        this.Struct = " " + this.str[5];
        this.Flat = " " + this.str[6];
    }

    public String to_string()
    {
        return Country + Region + City + Street + House + Struct + Flat;
    }
}
