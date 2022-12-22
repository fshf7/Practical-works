package InternetMarket;

public class Client extends User {
    private Basket basket;

    public Client(String login, String password, int basketSize) {
        super(login, password);
        basket = new Basket(basketSize);
    }

    public static Client fromUser(User user, int basketSize) {
        return new Client(user.login, user.password, basketSize);
    }

    public boolean buyProduct(Product product) {
        return basket.add(product);
    }

    public Basket getBasket() {
        return basket;
    }
}
