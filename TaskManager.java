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


        }
    } 
//リストにtaskを追加していく
    public void addTask(Task task){
        tasks.add(task);
    }




//ここで入力を受け取る
    public Task initTask() {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = "";
        boolean status = false;

        // Task ID (integer) を入力させる
        while (true) {
            System.out.print("Enter task ID (integer): ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                break; // 有効な入力ならループを抜ける
            } else {
                System.out.println("Invalid input: Task ID must be an integer.");
                scanner.next(); // 不正な入力をスキップ
            }
        }

        // Task Name (string) を入力させる
        scanner.nextLine(); // 改行を消費
        while (true) {
            System.out.print("Enter task name (string): ");
            name = scanner.nextLine();
            if (!name.isEmpty()) {
                break; // 名前が空でなければループを抜ける
            } else {
                System.out.println("Invalid input: Task name cannot be empty.");
            }
        }

        // Task Status (boolean) を入力させる
        while (true) {
            System.out.print("Enter task status (true/false): ");
            if (scanner.hasNextBoolean()) {
                status = scanner.nextBoolean();
                break; // 有効な入力ならループを抜ける
            } else {
                System.out.println("Invalid input: Task status must be true or false.");
                scanner.next(); // 不正な入力をスキップ
            }
        }

        // 有効な入力からTaskオブジェクトを作成して返す
        Task newTask = new Task(id, name, status);
        return newTask;
    }

         
}


// タスククラスをarraylistにaddする関数機能の実装をする
// run()関数の中でそれらを動かす機能の実装
