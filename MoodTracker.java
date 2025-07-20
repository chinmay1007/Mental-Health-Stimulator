import java.util.Scanner;

public class MoodTracker {
    private Scanner scanner = new Scanner(System.in);

    public String askMood() {
        System.out.println("How are you feeling today? (Happy / Sad / Anxious / Angry / Neutral)");
        return scanner.nextLine();
    }
}
