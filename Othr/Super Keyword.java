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
        super(); // Calls parent class constructor
        System.out.println("Child Constructor");
    }

void display() {
        super.display();