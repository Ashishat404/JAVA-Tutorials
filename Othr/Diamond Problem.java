// Example of diamond problem and its solution (Interfaces) IN JAVA

interface A {
    default void display() {
        System.out.println("Display from A");
    }
}
interface B extends A {
    default void display() {
        System.out.println("Display from B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Display from C");
    }
}

class D implements B, C {
    // Resolve the diamond problem by 
overriding the display method
    @Override
    public void display() {
        // Option 1: Call a specific 