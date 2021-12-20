import java.util.*;

public class Contact {
    private String Name;
    private String Surname;
    private String Phone;
    private Group Group;

    public Contact(String name, String surname, String phone, Group group) {
        Name = name;
        Surname = surname;
        Phone = phone;
        Group = group;
    }


    @Override
    public String toString() {
        return Phone+" "+Name+" "+Surname+" "+Group;
    }
}
