package control;

public class Time {
    /**
     * field time
     */
    public int time = 0;
    /**
     * field instance
     */
    private static Time instance;

    /**
     * constructor
     */
    private Time() {
    }

    /**
     * Singleton
     *
     * @return instance
     */
    public static Time getInstance() {
        if (instance == null) {
            instance = new Time();
        }
        return instance;
    }

    @Override
    public int hashCode() {
        return this.time;
    }
}