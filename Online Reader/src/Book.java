public class Book {
    private String bookName;
    private int pageNumber;
    private int priceOfBook;
    private static int memorySize = 0;
    private SheetSize sheetSize;
    private Publisher publisher;

    public Book(String bookName, int pageNumber, int priceOfBook, int memorySize, SheetSize sheetSize, Publisher publisher) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.priceOfBook = priceOfBook;
        this.memorySize++;
        this.sheetSize = sheetSize;
        this.publisher = publisher;
    }

    public int DiffPrice(Book book) {
        int priceDiff = Math.abs(this.priceOfBook - book.priceOfBook);
       return priceDiff;
    }
public void  CompareSheetNumber(Book book){
        int compareSheetNumber = this.pageNumber - book.pageNumber;
        if(compareSheetNumber<0) System.out.println(this.bookName+" has less page than "+book.bookName);
        else if (compareSheetNumber>0)System.out.println(this.bookName+" has more page than "+book.bookName);
        else System.out.println(this.bookName+" has equal page to "+book.bookName);
}
public void ListsOfPagesForScanning(Book book){
       int bookCover = 2;
        if(this.pageNumber%2==0) System.out.println(this.bookName+" needs "+this.pageNumber/2+bookCover+" lists of page for scanning");
        else System.out.println(this.bookName+" needs "+this.pageNumber/2+bookCover+1+" lists of page for scanning");
}
@Override
    public String toString() {
        return ("Book:" + bookName + "\n Number of Page: " + pageNumber + "\n+ The price: "
                + priceOfBook + "\n Paper size: " + sheetSize
                + "\n Publisher: " + publisher);
    }
    }


