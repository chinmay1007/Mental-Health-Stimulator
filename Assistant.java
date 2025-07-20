public class Assistant {
    private User user;
    private MoodTracker moodTracker = new MoodTracker();
    private QuoteProvider quoteProvider = new QuoteProvider();
    private CalmActivity calmActivity = new CalmActivity();

    public void startSession() {
        System.out.println("Welcome to your Mental Health Assistant.");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        user = new User(name);
        String currentMood = moodTracker.askMood();
        user.setMood(currentMood);

        System.out.println("\nHello " + user.getName() + ", you are feeling " + user.getMood());

        calmActivity.suggestActivity(currentMood);
        System.out.println("\nHere's a motivational quote:");
        System.out.println("\"" + quoteProvider.getQuote() + "\"");

        System.out.println("\nTake care, " + user.getName() + "! ❤️");
    }
}
