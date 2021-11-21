public interface Reader {
    void takeBook(int book);

    void returnBook(int book);

    boolean isOverdue();
}
