import javax.swing.*;

public class Class2 {

   public static void main(String[] args) {
      JFrame frame = new JFrame("HW 7/2");
      frame.setSize(700, 500);

      JPanel panel = new JPanel();
      frame.add(panel);

      JLabel userLabel = new JLabel("Username:");
      userLabel.setBounds(10, 20, 80, 25);
      panel.add(userLabel);

      JTextField userText = new JTextField(20);
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);


      JButton loginButton = new JButton("Login");
      loginButton.setBounds(10, 80, 80, 25);
      panel.add(loginButton);

      frame.setVisible(true);
   }
}