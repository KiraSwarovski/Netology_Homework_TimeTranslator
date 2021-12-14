import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter some text: ");
        Scanner input = new Scanner(System.in);
        String strings = input.nextLine();
        String[] tokens = strings.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count+1);
            }
//            display(map);
        }
        NavigableSet<WordSorter> navigableSet = convertToSet(map);
        displaySet(navigableSet);

    }

    private static void displaySet(NavigableSet<WordSorter> navigableSet) {
        for (WordSorter wordSorter: navigableSet){
            System.out.println(wordSorter);
        }
    }

    private static NavigableSet<WordSorter> convertToSet(Map<String, Integer> map) {
        NavigableSet<WordSorter> navigableSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            navigableSet.add(new WordSorter(e.getKey(),e.getValue()));
        }
        return navigableSet;
    }

    private static void display(Map<String, Integer> map) {
        Map<String, Integer> treemap = new TreeMap<>(map);
        Set<String> keys = treemap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + treemap.get(key));
        }
    }
}
