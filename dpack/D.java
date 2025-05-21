package dpack;

import bpack.B;
import cpack.C;

public class D {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        System.out.println("From Class B");
        b.display();

        System.out.println("From Class C");
        c.display();
    }
}
