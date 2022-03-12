public abstract class Processor {
    private String id;
    private String status;
    private static int numOfProcessors = 0;

    public Processor() {
        this.id = "P" + (++numOfProcessors);
        this.status = "idle";
    }

    public String getId() {
        return id;
    }
}
