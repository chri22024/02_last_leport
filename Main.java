import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Task> tasks = new ArrayList<Task>();

        DisplayTasks displayTasks = new DisplayTasks(tasks);
        TaskManager taskManager = new TaskManager(tasks);


        Thread thread1 = new Thread(displayTasks);
        Thread thread2 = new Thread(taskManager);


        thread1.start();
        thread2.start();



        thread1.join();
        thread2.join();
    }
}
