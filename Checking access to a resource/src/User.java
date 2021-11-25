public class User {
    private String login;
    private String emailAdress;
    private String password;
    private int age;

    public User(String login, String emailAdress, String password, int age) {
        this.login = login;
        this.emailAdress = emailAdress;
        this.password = password;
        this.age = age;
    }

    public String getLogin() { return login; }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
