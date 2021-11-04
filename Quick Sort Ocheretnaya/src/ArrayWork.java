class ArrayWork {
    private Product[] productList;  //array
    private int size;               //array size (number of elements)

    //constructor of empty array
    public ArrayWork(int size) {
        productList = new Product[size];
        size = 0;
    }

    //adding element
    public void insert(Product value) {
        productList[size] = value;
        size++; //increase size
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(productList[i].toString());
        }
    }

    public void quickSortArr() {
        recQuickSort(0, size - 1);
    }

    public void recQuickSort(int left, int right) {
        if (right - left <= 0) { //if size<=1 - sorted
            return;
        } else {
            int pivot = productList[right].getPrice(); //right element
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);  //sort left part
            recQuickSort(partition+1, right); //sort right part
        }
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left-1;
        int rightPtr = right;
        while (true) {
            //search the biggest element
            while (productList[++leftPtr].getPrice() < pivot);
            //search the smallest element
            while (rightPtr > 0 && productList[--rightPtr].getPrice() > pivot);
            if (leftPtr >= rightPtr) { //if the pointers match,
                break;                   //complete the split
            } else {
                swap(leftPtr, rightPtr); //swap elements
            }
        }
        swap(leftPtr, right); //pivot swap
        return leftPtr;
    }

    public void swap(int dex1, int dex2) {
        Product temp = productList[dex1];
        productList[dex1] = productList[dex2];
        productList[dex2] = temp;
    }
}