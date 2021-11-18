
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break;
            slot = input - 1;
           // player.setOutOfRange(false);
            player.shotWithWeapon(slot);
//            if (player.getOutOfRange() == true) {
//              //  System.out.println("Invalid index");
//            }
        }
        System.out.println("Game over!");
    }
}
