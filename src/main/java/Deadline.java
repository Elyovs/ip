public class Deadline extends Task{
    protected String by;
    public Deadline(String taskDescription, String by) {
        super(taskDescription);
        this.taskType = TaskType.DEADLINE;
        this.by = by;
    }

    public String getBy() {
        return this.by;
    }


    @Override
    public void printAdd(int todosCount) {
        System.out.println("Got it! I've added this task: ");
        System.out.println("  [D][ ] "
                + this.getTaskDescription()
                + " (by: "
                + this.by
                + ")");
        System.out.println("Now you have " + todosCount + " tasks in your list.");
    }

    @Override
    public void printTask(int todoCount) {
        System.out.println((todoCount + 1)
                + ".[D]"
                + "["
                + (this.getTaskStatus() ? "X" : " ")
                + "] "
                + this.getTaskDescription()
                + "(by: "
                + this.by
                + ")");
    }
}
