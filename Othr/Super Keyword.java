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
    