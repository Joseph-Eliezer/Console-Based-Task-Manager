package addTask;
import java.util.Scanner;


import taskManager.taskManager;
import errorHandling.*;



public class addTask {
    static Scanner scanner = new Scanner(System.in);
    static final int maxTask = 100;
    static String[] addTasks = new String[maxTask];
    static int taskNumber = 0;
    

    public static void addSomeTask() {
        System.out.println();
        System.out.println("ADD TASK");
        System.out.println("=============\n");
        String task = stringValidation.validateInputString("Enter task name: ");
        addTasks[taskNumber] = task;
        taskNumber++;
        System.out.println("\nYou added " + task + " to your task\n");
        String more = YorNvalidation.validateInputStringYorN("add more task? y/n: ");

        if (more.equalsIgnoreCase("y")) {
            
            moreTask();
            
        } else if (more.equalsIgnoreCase("n")) {
            System.out.println();
            taskManager.menu();
        }
        
    }
    static void moreTask() {
        System.out.println();
        String task = stringValidation.validateInputString("Enter task name: ");
        addTasks[taskNumber] = task;
        taskNumber++;
        System.out.println("\nYou added " + task + " to your task\n");
        String more = YorNvalidation.validateInputStringYorN("add more task? y/n: ");

        if (more.equalsIgnoreCase("y")) {
            System.out.println();
          
            moreTask();
        } else if (more.equalsIgnoreCase("n")) {
            System.out.println();
            taskManager.menu();
        }
    }
    public static int getTaskNumber() {
        return taskNumber;
    }
    public static String[] getAddTasks() {
        return addTasks;
    }

}


