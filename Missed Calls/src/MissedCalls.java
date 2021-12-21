import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String missedNumber) {
        LocalDateTime lt = LocalDateTime.now();
        missedCalls.put(lt, missedNumber);
    }

    public void clearContact() {
        missedCalls.clear();
    }

    public void displayMissedCalls() {
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
