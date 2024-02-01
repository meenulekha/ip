import java.time.LocalDate;

public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description, LocalDate by) {
        super(description, TaskType.DEADLINE);
        this.by = by;
    }

    @Override
    public String toString() {
        //String[] arr = by.split(" ", 2);
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
    @Override
    public String getType(){
        return "D";
    }
    @Override
    public String toFileString(){
        return String.format("%s |  %d | %s | %s", getType(), isDone? 1:0, description, by);
    }
}