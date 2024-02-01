public class Task {
    public enum TaskType {
        TODO,
        DEADLINE,
        EVENT
    }
    protected String description;
    protected boolean isDone;
    protected TaskType taskType;

    public Task(String description, TaskType taskType) {
        this.description = description;
        this.isDone = false;
        this.taskType = taskType;

    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    //function to mark as done
    public void markAsDone() {
        this.isDone = true;
    }
    //function to unmark
    public void unMark(){
        this.isDone = false;
    }
    public String toString(){
        return "["+ this.getStatusIcon() +"] " + this.description;
    }


    public String toFileString(){
        return String.format("%s |  %d | %s", getType(), isDone? 1:0, description);
    }

    public static Task fromFileString(String fileString){
        String[] elements = fileString.split("\\s*\\|\\s*");
        Boolean done = Integer.parseInt(elements[1]) == 1;
        //for each type of task
        switch(elements[0]) {
            case "T":
                ToDo todo = new ToDo((elements[2]));
                todo.isDone = done;
                return todo;
            case "D":
                Deadline dline = new Deadline(elements[2], elements[3]);
                dline.isDone = done;
                return dline;
            case "E":
                Event event = new Event(elements[2], elements[3], elements[4]);
                event.isDone = done;
                return event;
            default:
                throw new IllegalArgumentException("Invalid task type in file");
            }

    }

    public String getType(){
        return " ";
    }
}

