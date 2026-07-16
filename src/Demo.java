public class Demo {

    public static void main(String[] args) {

        // Creating User Stories
        UserStory userStory1 = new UserStory(
                "US-001",
                "Ask Banking Questions",
                "As a customer, I want to ask banking questions and receive quick answers from the chatbot.",
                MoscowPriority.MUST_HAVE
        );

        UserStory userStory2 = new UserStory(
                "US-002",
                "View Bank Policies",
                "As a customer, I want to view bank policies to understand banking rules and services.",
                MoscowPriority.SHOULD_HAVE
        );


        // Creating Policies
        Policy policy1 = new Policy(
                "P-001",
                "Account Security Policy",
                "Customers must verify their identity before accessing sensitive account information.",
                "Security"
        );

        Policy policy2 = new Policy(
                "P-002",
                "Loan Application Policy",
                "Customers must provide required documents before applying for a loan.",
                "Loan"
        );


        // Display User Stories
        System.out.println("=== USER STORIES ===");
        userStory1.displayUserStory();
        System.out.println();

        userStory2.displayUserStory();
        System.out.println();


        // Display Policies
        System.out.println("=== BANK POLICIES ===");
        policy1.displayPolicy();
        System.out.println();

        policy2.displayPolicy();
    }
}