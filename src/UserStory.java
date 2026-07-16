
public class UserStory {

    private String id;
    private String title;
    private String description;
    private MoscowPriority priority;

    // Constructor
    public UserStory(String id, String title, String description, MoscowPriority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public MoscowPriority getPriority() {
        return priority;
    }

    // Display User Story Information
    public void displayUserStory() {
        System.out.println("User Story ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
    }
}