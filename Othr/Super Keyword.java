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
        super.display();// Calls parent class method
System.out.println("Child Method");
    }
void show() {
        System.out.println("Parent num: " + super.num);// Access parent class variable
System.out.println("Child num: " + this.num);
 }
}

public class Main{
public static void main(String[] args){
 Child child = new Child();
 child.display();
 child.show();