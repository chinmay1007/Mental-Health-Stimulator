import java.util.Random;

public class QuoteProvider {
    private String[] quotes = {
        "You are stronger than you think.",
        "Take a deep breath. Everything will be okay.",
        "This too shall pass.",
        "Be kind to yourself.",
        "Every day is a new beginning."
    };

    public String getQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}
