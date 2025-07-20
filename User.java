public class User {
    private String name;
    private String mood;

    public User(String name) {
        this.name = name;
        this.mood = "Neutral";
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
