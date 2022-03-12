public abstract class Task {
    private String id, state;
    private int creationTime, requestedTime;
    private Priority priority;
    private ClockCycle completionTime;
    private static int numOfTasks = 0;

    public Task(int creationTime, int requestedTime, Priority priority) {
        this.id = "T" + (++numOfTasks);
        this.creationTime = creationTime;
        this.requestedTime = requestedTime;
        this.priority = priority;
        this.state = "waiting";
    }

    public String getId() {
        return id;
    }
}
