import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("Ksenia");
        student.add("Amira");
        student.add(null);
        student.add(null);
        student.add("Max");
        Iterator<String> iter = student.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
