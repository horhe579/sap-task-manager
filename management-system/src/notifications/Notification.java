package notifications;

import entities.Bug;
import entities.Task;
import entities.User;

public class Notification {
    private String notificationDescription;
    private User recipient;

    public Notification(User recipient, String notificationDescription) {
        this.recipient = recipient;
        this.notificationDescription = notificationDescription;
    }

    @Override
    public String toString() {
        StringBuilder notificationMessage = new StringBuilder();
        notificationMessage.append("Recipient #"
                + this.recipient.getId().toString()
                + "(" + this.recipient.getEmail() + "): \n"
                + notificationDescription);
        notificationMessage.append("\n");

        return notificationMessage.toString();
    }
}
