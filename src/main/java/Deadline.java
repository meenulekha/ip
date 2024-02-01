public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description, TaskType.DEADLINE);
        this.by = by;
    }

    @Override
    public String toString() {
        String[] arr = by.split(" ", 2);
        return "[D]" + super.toString() + " (by: " + arr[1] + ")";
    }
    @Override
    public String getType(){
        return "D";
    }
}