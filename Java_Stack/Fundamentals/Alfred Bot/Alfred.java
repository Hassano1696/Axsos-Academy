import java.util.Date;

public class Alfred {
    public String basicGreeting() {
        // You don't need to code here, this is an example method
        return "Hello, nice to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hi, " + name + ". Nice to see you.";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir.";
        }

        else if (conversation.indexOf("Alfred") > -1) {
            return "As you wish, naturally.";
        }
        else
        return "Right. And with that I shall retire.";
    }
}
