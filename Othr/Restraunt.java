class Restaurant {
    private boolean foodReady = false;
    
 // Serve food method (Customer waits until food is ready)
    public synchronized void serveFood() {
        while (!foodReady) {
            try {
                System.out.println("Customer is waiting for food...");
                wait(); // Customer waits until notified
                  } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
System.out.println("Customer is served food. Enjoy the meal!");
foodReady = false; // Reset foodReady for the next order
notify(); // Notify chef that food has been served
    }
// Prepare food method (Chef prepares and notifies customer)
  public synchronized void prepareFood() ) {
        while (foodReady) {
            try {
                System.out.println("Chef is waiting to prepare food...");
                wait(); // Chef waits until food is served
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
        }
        System.out.println("Chef is preparing food...");
        try {
            Thread.sleep(20000); // Simulate time taken to prepare food
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
        foodReady = true; // Food is ready
        System.out.println("Chef has prepared the food and notifies the customer.");
        notify();// Notify customer that food is ready
    }
}
public class RestaurantSimulation {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        
        // Customer thread
        Thread customer = new Thread(() -> {
            while (true) {
                restaurant.serveFood();
                
