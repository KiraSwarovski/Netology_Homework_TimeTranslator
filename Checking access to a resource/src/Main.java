import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        scanner.close();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Welcome");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 15);
        User user2 = new User("max", "max@gmail.com", "qwerty", 21);
        User user3 = new User("lilia", "lilia@gmail.com", "qazwsx", 20);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("s 18< Access is denied");
        }
    }
}
