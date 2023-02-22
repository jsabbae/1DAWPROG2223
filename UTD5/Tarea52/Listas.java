package UTD5.Tarea52;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Listas {


    private static String Tasklist;
    private static Object TaskList;
    private static String task;

    public static void main(String[] args) {


        List<String> taskList;


        public Listas(String TaskList) {


            if (TaskList.equals("ArrayList")) {
                taskList = new ArrayList<>();


            } else if (TaskList.equals("LinkedList")) {
                taskList = new LinkedList<>();



            } else {
                System.out.println("No es correcto");
            }
        }



        public void addTask (String task){
            taskList.add(task);
        }



        public void removeTask (String task){
            taskList.remove(task);
        }


        public void completeTask (String task){
            taskList.clone(task);
            System.out.println("compleatado");
        }


        public String getTasks (String task){
            return taskList.get(Integer.parseInt(task));
        }
    }
}

