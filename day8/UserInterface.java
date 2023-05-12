import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserInterface {

   public static void main(String[] args) {
      JFrame frame = new JFrame("User Interface Example");
      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();
      panel.setLayout(null);
      frame.add(panel);

      JLabel userLabel = new JLabel("Username:");
      userLabel.setBounds(10, 20, 80, 25);
      panel.add(userLabel);

      JTextField userText = new JTextField(20);
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);

      JLabel passwordLabel = new JLabel("Password:");
      passwordLabel.setBounds(10, 50, 80, 25);
      panel.add(passwordLabel);

      JPasswordField passwordText = new JPasswordField(20);
      passwordText.setBounds(100, 50, 165, 25);
      panel.add(passwordText);

      JButton loginButton = new JButton("Login");
      loginButton.setBounds(10, 80, 80, 25);
      panel.add(loginButton);

      JButton readButton = new JButton("Read from file");
      readButton.setBounds(100, 80, 120, 25);
      panel.add(readButton);

      JButton writeButton = new JButton("Write to file");
      writeButton.setBounds(220, 80, 120, 25);
      panel.add(writeButton);

      readButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               File file = new File("data.txt");
               BufferedReader br = new BufferedReader(new FileReader(file));
               String line;
               while ((line = br.readLine()) != null) {
                  System.out.println(line);
               }
               br.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
         }
      });

      writeButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               String username = userText.getText();
               String password = String.valueOf(passwordText.getPassword());
               BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
               writer.write(username);
               writer.newLine();
               writer.write(password);
               writer.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
         }
      });

      frame.setVisible(true);
   }
}
