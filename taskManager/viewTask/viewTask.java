package viewTask;


import java.util.Scanner;

import taskManager.taskManager;

public class viewTask {
    static Scanner scanner = new Scanner(System.in);
    public static void viewSomeTask(int taskNumber, String[] addTasks, boolean[] status) {
     System.out.println("");
      System.out.println("VIEW TASK");
        System.out.println("=============\n");
        for (int i = 0; i < taskNumber; i++) {
            String myStatus = status[i] ? "(DONE)" : "(IN PROGRESS)";
            System.out.println("Task " + (i+1) + ": " + addTasks[i] + " " + myStatus);
            
        }

        taskManager.menu();

    }
    
}
