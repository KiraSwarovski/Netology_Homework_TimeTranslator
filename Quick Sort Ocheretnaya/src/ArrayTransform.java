class ArrayTransform {
    private ProductList[] productListArray;
    private int size;

    public ArrayTransform(int size) {
        productListArray = new ProductList[size];
    }

    public void insert(ProductList name) {
        productListArray[size] = name;
        size++;

    }

    public void displayArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(productListArray[i].toString());
        }
    }

    public void quickSortArr() {
        recursionOfQS(0, size - 1);
    }

    public void recursionOfQS(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = productListArray[right].getPrice();
            int partition = partitionIt(left, right, pivot);
            recursionOfQS(left, partition - 1);
            recursionOfQS(partition + 1, right);
        }
    }

    public void swap(int num1, int num2) {
        ProductList temp = productListArray[num1];
        productListArray[num1] = productListArray[num2];
        productListArray[num2] = temp;
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPart = left - 1;
        int rightPart = right;
        while (true) {
            while (productListArray[++leftPart].getPrice() < pivot) ;
            while (rightPart > 0 && productListArray[--rightPart].getPrice() > pivot) ;
            if (leftPart >= rightPart) {
                break;
            } else {
                swap(leftPart, rightPart);
            }
        }
        swap(leftPart, right);
        return leftPart;
    }


}