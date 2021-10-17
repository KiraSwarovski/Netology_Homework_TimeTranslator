public class Main {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Krasnoe Znamya", "Russia");
        Publisher publisher2 = new Publisher("De Agostini", "Italy");
        Publisher publisher3 = new Publisher("Leuchtturm", "Germany");
        Publisher publisher4 = new Publisher("Nature America", "USA");
        Book book1 = new Book("Divorce", 300, 520, 220, SheetSize.A5, publisher1);
        Book book2 = new Book("Cooking pizza with family", 11, 2120, 320, SheetSize.A4, publisher2);
        Book book3 = new Book("Reader", 900, 1520, 1320, SheetSize.A5, publisher3);
        Book book4 = new Book("Discovery Magazine", 89, 420, 325, SheetSize.A1, publisher4);
        //проверим несколько методов:
        System.out.println("Total number of books "+Book.totalNumberOfBooks);
        System.out.println(book1+"\n");
        System.out.println("The price difference between "+book1.getBookName()+" and "+book3.getBookName()+" is "+book1.DiffPrice(book3)+" rubles");
        book2.CompareSheetNumber(book4);
        book4.CompareLenghtOfPublisherName(book3);
        book1.ListsOfPagesForScanning();
    }



}

