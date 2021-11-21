public class Main {
    public static void main(String[] args) {
        AdministratorLibraryImp admin = new AdministratorLibraryImp("Ksenia", 1996);
        Supplier supplier = new SupplierImp("Supplier1", 1991);
        Reader reader1 = new ReaderImp("Reader1", 1994);
        Reader reader2 = new ReaderImp("Reader2", 1994);
        
        admin.orderBook(supplier);
        supplier.supplyingBook(100);
        reader1.takeBook(1);
        reader1.takeBook(2);
        reader1.takeBook(3);
        reader2.takeBook(0);
        supplier.supplyingBook(20);
        admin.overdueNotification(reader1);
        admin.overdueNotification(reader2);
    }
}
