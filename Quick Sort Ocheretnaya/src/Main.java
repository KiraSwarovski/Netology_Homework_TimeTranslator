class Main {
    public static void main(String[] args) {
        int size = 5;
        ArrayTransform arr;
        arr = new ArrayTransform(size);
        ProductList productList1 = new ProductList("Sugar", 125, "sugar is made by first extracting sugar juice from sugar beet or sugar cane plants");
        ProductList productList2 = new ProductList("Tea", 75, "tea is an aromatic beverage commonly prepared by pouring hot or boiling water over cured or fresh leaves");
        ProductList productList3 = new ProductList("Milk", 55, "milk is a nutrient-rich liquid food produced by the mammary glands of mammals.");
        ProductList productList4 = new ProductList("Beer", 165, "beer is one of the oldest and most widely consumed alcoholic drinks in the world");
        ProductList productList5 = new ProductList("Paper", 80, "paper is a thin sheet material produced by mechanically or chemically processing cellulose fibres derived from wood");
        arr.insert(productList1);
        arr.insert(productList2);
        arr.insert(productList3);
        arr.insert(productList4);
        arr.insert(productList5);

        System.out.println("Unsorted array:");
        arr.displayArray();
        arr.quickSortArr();
        System.out.println("Sorted array:");
        arr.displayArray();
    }

}