package InternetMarket;

public class User {
    protected String login;
    protected String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authentificate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}
