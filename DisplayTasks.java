import java.util.ArrayList;
public class DisplayTasks implements Runnable{



    private ArrayList<Task> tasks;
    private boolean running = true;

    public DisplayTasks(ArrayList<Task> tasks){
        this.tasks = tasks;
    }


    public void run(){
        while(running){
            displayTasks(tasks);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    public void displayTasks(ArrayList<Task> tasks) {
        
        System.out.println("===================================");
        for (Task task : tasks) {
            System.out.println(task.show());
        }
        System.out.println("===================================");

    }


    public void stopRunning(){
        running = false;
    }

    
}
