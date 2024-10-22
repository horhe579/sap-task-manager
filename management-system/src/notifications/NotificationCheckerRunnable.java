package notifications;

import java.util.Deque;

public class NotificationCheckerRunnable implements Runnable{

    NotificationQueue queue;

    public NotificationCheckerRunnable(NotificationQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //while q is not empty, empty it and print toString of elements
        while(true)
        {
            try {
                Notification  n = this.queue.removeNotification();
                System.out.println(n.toString());
            } catch (Exception e) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
