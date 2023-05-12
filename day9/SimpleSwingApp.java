import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingApp {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JAVA OOP h/w 8 Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);


        JButton button = new JButton("which h/w is this?");
        frame.getContentPane().add(button);

        
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(frame, "This is 8th h/w");
            }
        });

        

        frame.setVisible(true);
    }
}
