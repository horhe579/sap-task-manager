# Task Management System in Java

## Objective
Develop a simple Task Management System in Java with CRUD operations and user notifications. __Focus on logical thinking and clean code rather than perfecting every detail!__

## Requirements

### 1. Domain Classes
Implement the following class hierarchy in Java:

- User
- Project
- Task (abstract class)
  - Bug
  - Feature

Implement the following classes based on the hierarchy above:

- `User`
  - Properties - `id`, `name`, `email`
- `Project`
  - Properties - `id`, `name`, `description`
- `Task` (abstract class)
  - Properties - `id`, `title`, `description`, `status` (TO_DO, IN_PROGRESS, DONE), `assignedUser`, `project`
- `Bug` (inherits from `Task`)
  - Additional properties - `severity`, `affectedVersion`
- `Feature` (inherits from `Task`)
  - Additional properties - `priority` (HIGH, MEDIUM, LOW), `stakeholder` (who requested the feature)

### 2. CRUD Operations

Implement Create, Read, Update, and Delete operations on top of the domain. Follow a Repository pattern approach. Use in-memory data structure (e.g., Map, List etc). Do not focus on complex ORM features!

### 3. Asynchronous Notification System
Implement a simple notification system that simulates sending a notification to a user when a task is assigned to them. 

- Create a `NotificationQueue` class that acts as a simple message queue.
- In `main` - using your Repository create one User and a Task for this user. Then add a notification with appropriate message to the queue.
- Implement a separate "worker" (thread) that periodically checks the queue and "sends" notifications.
- For the actual "sending" of notifications, simply print to console using `System.out.println()`.
