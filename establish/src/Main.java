public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 3};
        int output = calc(numbers);
        System.out.println(output);
    }

    public static int calc(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            ans += arr[i] - arr[i - 1];
        }
        return ans;
    }
}
