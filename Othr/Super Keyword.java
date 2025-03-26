class Parent {
    int num = 100;
    Parent() {
        System.out.println("Parent Constructor");
    }
    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int num = 200;
    Child() {
        

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
    }
}