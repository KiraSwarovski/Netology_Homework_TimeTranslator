class BinarySearch {
    int binary(int[] arr, int x) {
        int last = -1;
        for (int i = 0; i <arr.length; i++) {
            if (x !=arr[i]){
                continue;
            }
            last = i;
        }
        if(last!=-1) {
            return arr.length - last - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        int r = arr.length;
        int l = 0;
        int result = ob.binary(arr, 32);
        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Element index is " + result);
        }
    }
}