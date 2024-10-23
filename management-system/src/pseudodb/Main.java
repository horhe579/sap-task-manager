package pseudodb;

import entities.Feature;
import entities.Project;
import entities.Task;
import entities.User;
import enums.Priority;
import enums.TaskStatus;
import notifications.Notification;
import notifications.NotificationCheckerRunnable;
import notifications.NotificationQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            InMemoryEntityManager userManager = new InMemoryEntityManager<User>();
            InMemoryEntityManager taskManager = new InMemoryEntityManager<Task>();

            User gosho = new User("Georgi",
                    "georgigeorgi@gmail.com");

            Task feature = new Feature("Asynchronous Notification System",
                    "Implement a simple notification system that simulates sending a notification to a user when a task is assigned to them."
                    , TaskStatus.TO_DO
                    , gosho
                    , new Project()
                    , Priority.MEDIUM
                    , "Valyo"
            );
            NotificationQueue queue = new NotificationQueue();

            userManager.addEntry(gosho);

            //    public Feature(String title, String description, TaskStatus status, User assignedUser, Project project, Priority priority, String stakeholder) {
            //        super(title, description, status, assignedUser, project);
            taskManager.addEntry(feature);
            queue.addNotification(new Notification(gosho, feature.getDescription()));

            Thread notificationThread = new Thread(new NotificationCheckerRunnable(
                    queue
            ));

            notificationThread.start();

            String newTaskMessage = "";

            while(!newTaskMessage.equals("fired"))
            {
                newTaskMessage = sc.nextLine();
                queue.addNotification(new Notification(
                        gosho,
                        newTaskMessage));
            }
            notificationThread.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
