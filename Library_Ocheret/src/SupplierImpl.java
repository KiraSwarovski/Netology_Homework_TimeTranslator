public class SupplierImpl extends User implements Supplier {

    public SupplierImpl(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void bringBooks() {
        System.out.printf("Supplier  brings new books%n",this.getName());
    }
}