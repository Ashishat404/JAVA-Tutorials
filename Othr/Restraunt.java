class Restaurant {
    private boolean foodReady = false;
 // Serve food method (Customer waits until food is ready)
    public synchronized void serveFood() {
        while (!foodReady) {
            try {
                System.out.println("Customer is waiting for food...");
                wait(); // Customer waits until notified
                
