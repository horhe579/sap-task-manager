package notifications;

import java.util.ArrayDeque;
import java.util.Deque;

public class NotificationQueue {
    private Deque<Notification> notifications = new ArrayDeque<>();

    public Deque<Notification> getNotifications() {
        return notifications;
    }

    public void addNotification(Notification notification)
    {
        this.notifications.add(notification);
    }

    public Notification removeNotification()
    {
        return this.notifications.remove();
    }
}
