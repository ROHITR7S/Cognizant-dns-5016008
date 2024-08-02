public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        Task task1 = new Task("T001", "Task 1", "Pending");
        Task task2 = new Task("T002", "Task 2", "Completed");
        Task task3 = new Task("T003", "Task 3", "In Progress");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch for T002:");
        Task searchedTask = taskList.searchTask("T002");
        System.out.println(searchedTask != null ? searchedTask : "Task not found!");

        System.out.println("\nDelete Task T002:");
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}
