class C {
    public int c;
    public void print() {
        System.out.println("C.i = " + c);
    }
}

class D extends C {
    public String i;

    public D(String a, int b) {
       super.c = b;
        i = a;
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}

public class UseSuper {
    public static void main(String[] args) {
        D d = new D("someString", 2);
        d.print();
        System.out.println(d.i);
    }
}