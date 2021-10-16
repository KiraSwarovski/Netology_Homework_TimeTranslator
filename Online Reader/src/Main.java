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
       int arrSize = Book.totalNumberOfBooks;
       book1.CompareLenghtOfPublisherName(book2);

      System.out.println(arrSize);
      //чтобы проверить один из методов в Book, создадим 2д массив и посчитаем все возможные разности цены книг
        // этих разностей будет 9 шт.
        // после вычисления всех разностей, воспользуюсь по 1 методу

        int arr[][] = new int[arrSize][arrSize];
        System.out.println(book1.getPriceOfBook());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[0][0] = 0; //1
                arr[0][1] = book1.getPriceOfBook();//2
                arr[0][2] = 0;//3
                arr[0][3] = 0;//4
                arr[0][4] = 0;//5
                arr[1][0] = 0;//6
                arr[1][1] = 0;//7
                arr[1][2] = 0;//8
                arr[1][3] = 0;//9
                arr[1][4] = 0;//10
                arr[2][0] = 0;//11
                arr[2][1] = 0;//12
                arr[2][2] = 0;//13
                arr[2][3] = 0;//14
                arr[2][4] = 0;//15
                arr[3][0] = 0;//16
                arr[3][1] = 0;//17
                arr[3][2] = 0;//18
                arr[3][3] = 0;//19
                arr[3][4] = 0;//20
                arr[4][0] = 0;//21
                arr[4][1] = 0;//22
                arr[4][2] = 0;//23
                arr[4][3] = 0;//24
                arr[4][4] = 0;//25

            }
        }
    }

    public static void Tabulation() {
        String star = "*";
        for (int i = 0; i < 10; i++) {
            System.out.print(star+"\t");
        }
        System.out.println("\n");
    }
}
