package Contacts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String missedNumber) {
        LocalDateTime lt = LocalDateTime.now();
        missedCalls.put(lt, missedNumber);
    }

    public void clearContact() {
        missedCalls.clear();
    }

    public void displayMissedCalls(PhoneContacts phoneContacts, MissedCalls _missedCalls) {
        System.out.println("Missed calls list: ");
        for (Map.Entry<LocalDateTime, String> entry : _missedCalls.missedCalls.entrySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
            String formatDateTime = entry.getKey().format(formatter);
            boolean flag = phoneContacts.searchContactByPhoneNumber(missedCalls.get(entry.getValue()));
            String name = phoneContacts.getContacts(flag);
            if (!name.equals(null)) {
                System.out.println(formatDateTime+" "+name);
            } else {
                System.out.println(formatDateTime+" "+entry.getValue());
            }
        }
    }

}
