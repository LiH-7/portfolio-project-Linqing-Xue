import java.util.ArrayList;
import java.util.List;

public class SimpleToDoList {

    private final List<String> tasks;

    public SimpleToDoList() {
        this.tasks = new ArrayList<>();
    }

    // Kernel methods
    public void add(int index, String task) {
        if (task == null) {
            throw new IllegalArgumentException("task cannot be null");
        }
        tasks.add(index, task);
    }

    public String remove(int index) {
        return tasks.remove(index);
    }

    public int length() {
        return tasks.size();
    }

    // Secondary methods
    public void addTask(String task) {
        add(length(), task);
    }

    public String get(int index) {
        return tasks.get(index);
    }

    public int indexOf(String task) {
        return tasks.indexOf(task);
    }

    public boolean removeTask(String task) {
        return tasks.remove(task);
    }

    @Override
    public String toString() {
        return tasks.toString();
    }

    public static void main(String[] args) {
        SimpleToDoList todo = new SimpleToDoList();

        todo.addTask("Write proof of concept");
        todo.addTask("Study CSE2231");
        todo.addTask("Exercise");

        System.out.println("Initial tasks: " + todo);

        todo.add(1, "Drink coffee");
        System.out.println("After inserting: " + todo);

        todo.removeTask("Study CSE2231");
        System.out.println("After removing by value: " + todo);

        System.out.println("First task: " + todo.get(0));
        System.out.println("Index of Exercise: " + todo.indexOf("Exercise"));
    }
}
