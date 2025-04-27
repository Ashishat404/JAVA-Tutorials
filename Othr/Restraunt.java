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
} catch (InterruptedException e)
