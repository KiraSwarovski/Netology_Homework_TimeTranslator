import java.util.*;
import java.util.Collections;

public class TreeSetClass {
    Set<Candidate> candidates = new TreeSet<>(new compareByRate());
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

    class compareByRate implements Comparator<Candidate> {
        public int compare(Candidate s1, Candidate s2) {
            if (s1.getRelevance() > s2.getRelevance()) {
                return 1;
            }
            if (s1.getRelevance() == s2.getRelevance()&&s1.getRating() > s2.getRating()) {
                    return 1;
            }
            else {
                return -1;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidates);
    }


    public void displayCandidates() {
        Comparator<Candidate> compareByRelandRate = Comparator
                .comparing(Candidate::getRelevance)
                .thenComparing(Candidate::getRating);
        candidates.addAll(list);
        Collections.sort(list, compareByRelandRate);

        Set<Candidate> sb = new TreeSet<Candidate>(compareByRelandRate);

//        candidates.sort(Comparator.comparing(Candidate::getRelevance));
        System.out.println("Candidates list: ");
        for (Candidate info : candidates) {
            System.out.println(info);
        }

    }


}