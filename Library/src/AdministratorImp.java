class AdministratorLibraryImp extends User implements Administrator, Librarian {

    public AdministratorLibraryImp(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void overdueNotification(Reader reader) {
        if (reader.isOverdue()) {
            System.out.printf("%s is going to punish %s for delay book(s)%n", getName(), reader);
        } else {
            System.out.printf("%s going to relax ", getName());
        }
    }

    @Override // Librarian
    public void orderBook(Supplier supplier) {
        System.out.printf("%s is ready to order books from a suppliers %n",
                super.getName());
    }


}
