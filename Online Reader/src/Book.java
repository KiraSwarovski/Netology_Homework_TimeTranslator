
public class Book {


    public String getBookName() {
        return bookName;
    }

    private String bookName;
    private int pageNumber;
    private int priceOfBook;
    private int memorySize;
    private SheetSize sheetSize;
    private Publisher publisher;
    public static int totalNumberOfBooks = 0;

    public Book(String bookName, int pageNumber, int priceOfBook, int memorySize, SheetSize sheetSize, Publisher publisher) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.priceOfBook = priceOfBook;
        this.memorySize = memorySize;
        this.sheetSize = sheetSize;
        this.publisher = publisher;
        this.totalNumberOfBooks++;
    }

    public int DiffPrice(Book book) {
        int priceDiff = Math.abs(this.priceOfBook - book.priceOfBook);
        return priceDiff;
    }

    public void CompareSheetNumber(Book book) {
        int compareSheetNumber = this.pageNumber - book.pageNumber;
        if (compareSheetNumber < 0) System.out.println(this.bookName + " has less page than " + book.bookName);
        else if (compareSheetNumber > 0) System.out.println(this.bookName + " has more page than " + book.bookName);
        else System.out.println(this.bookName + " has equal page to " + book.bookName);
    }

    public void ListsOfPagesForScanning() {
        int bookCover = 2;
        int result=pageNumber/2;
        if (pageNumber % 2 == 0)
            System.out.println(bookName + " needs " + pageNumber/2+ " lists of page for scanning");
        else
            System.out.println(bookName + " needs " + pageNumber/2+1+ " lists of page for scanning");
    }

    public void CompareLenghtOfPublisherName(Book book) {
        int diffLenghtOfString = this.publisher.publisherName.length()-book.publisher.publisherName.length();
        if(diffLenghtOfString>0) System.out.println(this.bookName + " has longer publisher name than " + book.bookName);
        else if(diffLenghtOfString<0) System.out.println(this.bookName + " has less publisher name than " + book.bookName);
        else System.out.println(this.bookName + " has longer publisher name than " + book.bookName);

    }

    @Override
    public String toString() {
        return ("Book:" + bookName + "\n Number of Page: " + pageNumber + "\n+ The price: "
                + priceOfBook + "\n Paper size: " + sheetSize
                + "\n Publisher: " + publisher + "\n Memory required: " + memorySize);
    }
}


