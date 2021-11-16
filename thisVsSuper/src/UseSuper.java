class C {
    public int i;
    public void print() {
        System.out.println("C.i = " + i);
    }
}

class D extends C {
    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
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