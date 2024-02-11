package taskManager;

import java.util.Scanner;

import addTask.addTask;
import errorHandling.*;
import markTask.markTask;
import viewTask.*;

 public class taskManager { 

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    menu();
    }
    public static void menu() {
        System.out.println("TASK MANAGER");
        System.out.println("=============\n");
        System.out.println("[1] Add Task\n[2] Mark Task as Completed\n[3] View Task\n[4] Exit");
        int choice = intValidation.validateInput("Choose: ", 1, 4);

        switch (choice) {
            case 1:
            addTask.addSomeTask();
            break;
       
            case 2:
            markTask.markSometask(addTask.getTaskNumber(), addTask.getAddTasks());

            case 3:
            viewTask.viewSomeTask(addTask.getTaskNumber(), addTask.getAddTasks(), markTask.getStatus());
            break;

            case 4:
            System.out.println("\nThank You!");
            scanner.close();
            System.exit(0);
        }
    }
 }