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

