
public class Test {

    public static void main(String[] args) {
        // Create an instance of AlfredQuotes to access all of your AlfredQuotes methods
        Alfred AlfredBot = new Alfred();
        // Do some test greetings, providing the necessary data
        String testGreeting = AlfredBot.basicGreeting();
        String testGuestGreeting = AlfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = AlfredBot.dateAnnouncement();
        String alexisTest = AlfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = AlfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred knows where it is");
        String notRelevantTest = AlfredBot
                .respondBeforeAlexis("Maybe that's what Batman is all about. Not winning. Failing...");
        // Print the greetings to test.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}
