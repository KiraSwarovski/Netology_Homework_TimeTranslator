class AdministratorLibraryImp extends User implements Administrator,Librarian{


    public AdministratorLibraryImp(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void overdueNotification(Reader reader) {

    }

    @Override
    public void findBook() {

    }

    @Override // Librarian
    public void orderBook(Supplier supplier) {
        System.out.printf("%s is ready to order books from a supplier %s",
                super.getName(),supplier);
        System.out.println("\n");
    }


}
