public class Todo extends Task {
    public Todo(String taskDescription) {
        super(taskDescription);
        this.taskType = TaskType.TODO;
    }

    @Override
    public void printAdd(int todosCount) {
        System.out.println("Got it! I've added this task: ");
        System.out.println("  [T][ ] " + this.getTaskDescription());
        System.out.println("Now you have " + todosCount + " tasks in your list.");
    }

    @Override
    public void printTask(int todoCount) {
        System.out.println((todoCount + 1)
                + ".[T]"
                + "["
                + (this.getTaskStatus() ? "X" : " ")
                + "] "
                + this.getTaskDescription());
    }
}
