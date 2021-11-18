public class ReaderImpl extends User implements Reader {
    private int numBooks;

    public int getNumBooks() {
        return this.numBooks;
    }

    public void setNumBooks(int num) {
        this.numBooks = num;
    }

    public ReaderImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void pickUpBooks(int num) {
        this.setNumBooks(this.getNumBooks() + num);
        System.out.println("Reader "+this.getName()+" picked up "+num+
                " book(s) from the library. He now has "+this.getNumBooks());
    }

    @Override
    public void dropOffBooks(int num) {
        this.setNumBooks(this.getNumBooks() - num);
        System.out.println(this.getName() + " returned " + num
                + " book(s) in the library. He now has " + this.getNumBooks() + " more") ;
    }
}