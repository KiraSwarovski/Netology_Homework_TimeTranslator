public class Time {


    private long second = 0;

    public long getSecond() {
        return second;
    }


    public Time(int days, int hour, int minutes) {
        this.second = (multiplyValue(days, 86400) + multiplyValue(hour, 3600) + multiplyValue(minutes, 60));
    }

    private long multiplyValue(int time1, int someValue) {
        return (long) time1 * someValue;
    }

/*    @Override
    public String toString() {
        return "" + second;
    }*/
}
