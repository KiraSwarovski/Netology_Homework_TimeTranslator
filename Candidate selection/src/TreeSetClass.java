import java.util.*;
import java.util.Collections;

public class TreeSetClass implements Comparable<Candidate> {
    Set<Candidate> candidates = new TreeSet<>();
    List<Candidate> list = new ArrayList<>();


    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeSetClass that = (TreeSetClass) o;
        return Objects.equals(candidates, that.candidates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidates);
    }


    public void displayCandidates() {
//        Comparator<Candidate> compareByRelandRate = Comparator
//                .comparing(Candidate::getRelevance)
//                .thenComparing(Candidate::getRating);
////        Collections.sort(candidates, compareByRelandRate);
////
//        Set<Candidate> sb =new TreeSet<Candidate>(compareByRelandRate);

//        candidates.sort(Comparator.comparing(Candidate::getRelevance));

        System.out.println("Candidates list: ");
        for (Candidate info : candidates) {

            System.out.println(info);
        }

    }

    @Override
    public int compareTo(Candidate o) {
        return 0;
    }
}
