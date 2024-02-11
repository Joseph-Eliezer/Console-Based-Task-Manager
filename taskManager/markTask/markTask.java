package markTask;

import taskManager.taskManager;

public class markTask {
    static boolean[] status = new boolean[100];
    public static void markSometask(int taskNumber, String[] addtasks) {
        System.out.println("");
        System.out.println("MARK TASK");
          System.out.println("=============\n");
          int taskNum = errorHandling.intValidation.validateInput("Enter task number from 1 to " + taskNumber + ": ", 1, taskNumber);
          if (taskNum >= 1 && taskNum <= taskNumber) {
            status[taskNum - 1] = true;
            String marked = addtasks[taskNum - 1];
            System.out.println(marked + " marked as done\n");
            taskManager.menu();

          }

    }
    public static boolean[] getStatus() {
        return status;
    }
    
}
