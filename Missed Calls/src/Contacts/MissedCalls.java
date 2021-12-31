package Contacts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
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
            String name = phoneContacts.searchContactByPhoneNumber(entry.getValue());
            if("".equals(name)){
                System.out.println(formatDateTime+" "+entry.getValue());
            }
            else {
                System.out.println(formatDateTime+" "+name);

            }
        }
    }

}