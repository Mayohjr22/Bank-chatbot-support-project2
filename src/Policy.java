public class Policy {

    private String policyId;
    private String policyName;
    private String description;
    private String category;

    // Constructor
    public Policy(String policyId, String policyName, String description, String category) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.description = description;
        this.category = category;
    }

    // Getters
    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    // Display Policy Information
    public void displayPolicy() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Name: " + policyName);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
    }
}