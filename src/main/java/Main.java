public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Pylesos";
        card1.url = "https://www.website.com";

        Description description1 = new Description();
        description1.description = "Huawei, Vertikalnyi";
        description1.price = 500;

        card1.description = description1;


    }
}
