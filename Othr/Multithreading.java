class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
System.out.println(Thread.currentThread().getId() + " Value: " + i);
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        