import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String output = "";
        String input = "";
        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if ("end".equals(input)) break;
            int asciiNumber = Integer.parseInt(input, 8);
            char transferToNormal = (char) asciiNumber;
            output += transferToNormal;
        }
        System.out.println(output);
    }
}
