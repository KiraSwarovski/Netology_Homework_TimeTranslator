public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    public static int recursion(int x){
        if(x==1){
            return 1;

        }

        return recursion(x-1)*x;
    }
}
