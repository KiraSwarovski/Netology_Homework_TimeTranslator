import java.util.Scanner;


public class Main  {
    public static void main(String[] args) {
        TreeSetClass treeSetClass = new TreeSetClass();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        printAction();
        while (true) {
            typeInfo();
            input = scanner.nextLine();
            if("".equals(input)){
                break;
            }//
            String[] candidateInfo = input.split(", ");
            Candidate candidate;
            if (candidateInfo.length == 5) {
                candidate = new Candidate(candidateInfo[0],
                        candidateInfo[1],candidateInfo[2],
                        Integer.parseInt(candidateInfo[3]),
                        Integer.parseInt(candidateInfo[4]));
                treeSetClass.addCandidate(candidate);
                treeSetClass.displayCandidates();
            }
        }
    }

    public static void printAction() {
        System.out.println("Enter the information about the candidate" +
                " (enter an empty string to complete):");
    }

    public static void typeInfo() {
        System.out.println("Surname First name Patronymic, gender, age, resume relevance, interview grade:");
    }
}