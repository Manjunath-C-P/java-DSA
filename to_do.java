package to_do;

import java.util.ArrayList;
import java.util.Scanner;
public class to_do {


    // ArrayList to store the to-do tasks
    private ArrayList<String> tasks;



    // Constructor to initialize the task list
    public to_do() {
        tasks = new ArrayList<>();
    }

    // Method to add a task to the list
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Method to view all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to clear all tasks
    public void clearAllTasks() {
        tasks.clear();
        System.out.println("All tasks cleared!");
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        to_do todoList = new to_do();

        while (true) {
            // Menu options
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add a Task");
            System.out.println("2. Remove a Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Clear All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left over by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;

                case 2:
                    todoList.viewTasks();
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    todoList.removeTask(taskNumber - 1);  // Index is zero-based
                    break;

                case 3:
                    todoList.viewTasks();
                    break;

                case 4:
                    todoList.clearAllTasks();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

