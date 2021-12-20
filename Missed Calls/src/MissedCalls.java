import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String missedNumber) {
        LocalDateTime lt = LocalDateTime.now();
        missedCalls.put(lt,missedNumber);
    }
    public void
}
