import java.awt.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        Frame f = new Frame("Event Handling Example");
        Button b = new Button("Click Me");
        b.setBounds(50, 100, 60, 30);

        // Registering an event listener
        b.addActionListener(new 
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        f.add(b);
        f.setSize(200,200);
        f.setLayout(null);
        f.set.Visible(true);
    }
}
