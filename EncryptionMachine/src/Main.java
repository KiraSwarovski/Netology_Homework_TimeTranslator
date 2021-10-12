import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = "";
        String input = "";
        while (true){
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if("end".equals(input))break;
            int x = Integer.parseInt(input,8);
            char y= (char)x;
            word+=y;
        }
        System.out.println(word);
    }
}
