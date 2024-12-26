import java.util.ArrayList;
package TaskManager;
public class DisplayTasks implements Runnable{



    private ArrayList<Task> tasks;
    private boolean running = true;

    public DisplayTasks(ArrayList<Task> tasks){
        this.tasks = tasks;
    }


    public void run(){
        while(running){
            displayTasks(tasks);
            displayChoices();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    public void displayTasks(ArrayList<Task> tasks) {
        
        System.out.println("===================================");
        System.out.println("===================================");

    }

    public void displayChoices(){

        Scanner scanner = new Scanner(System.in);
        int choices = 0;

        while(true){
            System.out.println("Input 1 : new task, 2 : modif task");
            if(scanner.hasNextInt()){
                choices = scanner.nextInt();

            }
        }
    }


    public void stopRunning(){
        running = false;
    }

    
}
