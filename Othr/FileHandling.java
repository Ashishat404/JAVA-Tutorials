import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Specify the file name and path
            File file = newFile("example.txt");
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                  System.out.println("File already exists.");
            }
        } 
          