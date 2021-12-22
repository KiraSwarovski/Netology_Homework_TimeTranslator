import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        printAction();
        while (!"\n".equals(input)) {
            typeInfo();
            input = scanner.nextLine();
            String[] candidateInfo = input.split(", ");
            Candidate candidate;
            if (candidateInfo.length == 4) {
                candidate = new Candidate(candidateInfo[0])
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

