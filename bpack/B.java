package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        // System.out.println("Private: " + privateVar);
        System.out.println("Public: " + publicVar);
    }
}
