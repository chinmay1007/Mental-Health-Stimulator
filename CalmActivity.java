public class CalmActivity {
    public void suggestActivity(String mood) {
        System.out.println("\nBased on your mood, try this:");

        switch (mood.toLowerCase()) {
            case "sad":
                System.out.println("- Listen to soft music.");
                break;
            case "anxious":
                System.out.println("- Try 4-7-8 breathing exercises.");
                break;
            case "angry":
                System.out.println("- Take a short walk.");
                break;
            case "happy":
                System.out.println("- Share your joy with someone!");
                break;
            default:
                System.out.println("- Meditate for 5 minutes.");
        }
    }
}
