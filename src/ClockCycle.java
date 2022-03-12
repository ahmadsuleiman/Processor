public abstract class ClockCycle {
    private String id;
    private static int numOfClockCycles = 0;

    public ClockCycle() {
        this.id = "C" + (++numOfClockCycles);
    }

    public String getId() {
        return id;
    }
}
