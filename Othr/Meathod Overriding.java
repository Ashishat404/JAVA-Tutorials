// Superclass
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
   }
}
public class MethodOverridingExample{
    public static void main(String[] args) {
  Animal myAnimal = new Animal();// Animal refrence and object
Animal myDog = new Dog()