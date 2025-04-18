// Exception Handling in java 
try {
    // Code that may throw an exception
} catch (ExceptionType1 e1) {
    // Handle exception e1
} catch (ExceptionType2 e2) {
    // Handle exception e2
}

public void myMethod() throws IOException {
    throw new IOException("File not found");
}


// try catch finally
import java.io.*;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // This code may throw an IOException
            FileReader file = new FileReader("test.txt");
            BufferedReader fileInput = new BufferedReader(file);
// Print the first line of the file
            
            