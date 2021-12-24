import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Candidate> candidates = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        printAction();
        while (true) {
            typeInfo();
            input = scanner.nextLine();
            if("".equals(input)){
                break;
            }
            String[] candidateInfo = input.split(", ");
            Candidate candidate;
            if (candidateInfo.length == 5) {
                candidate = new Candidate(candidateInfo[0],
                        candidateInfo[1],candidateInfo[2],
                        Integer.parseInt(candidateInfo[3]),
                        Integer.parseInt(candidateInfo[4]));
                candidates.add(candidate);
                displayCandidates(candidates);
            }
        }
        displayCandidates(candidates);
    }

    public static void printAction() {
        System.out.println("Enter the information about the candidate" +
                " (enter an empty string to complete):");
    }

    public static void typeInfo() {
        System.out.println("Surname First name Patronymic, gender, age, resume relevance, interview grade:");
    }
    public static void displayCandidates(Set<Candidate> candidates){
        System.out.println("Candidates list: ");
        for (Candidate info : candidates) {
            System.out.println(info);
        }
    }
}

