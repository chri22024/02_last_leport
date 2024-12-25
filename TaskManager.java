import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager implements Runnable{
    private ArrayList<Task> tasks;

    private boolean running = true;
    
    public TaskManager(ArrayList<Task> tasks){
        this.tasks = tasks;
    }
    public void run(){

        while(running){
            addTask(initTask());
        }
    } 

    public void addTask(Task task){
        tasks.add(task);
    }


    public Task initTask(){

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.nextLine();
        boolean status = scanner.nextBoolean();

        Task newTask = new Task(id, name, status);

        return newTask;

    }



         
}


// タスククラスをarraylistにaddする関数機能の実装をする
// run()関数の中でそれらを動かす機能の実装
