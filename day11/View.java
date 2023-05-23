import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JButton openButton;
    private JButton saveButton;
    private JButton findButton;
    private JTextArea textArea;

    public View() {
        setTitle("File Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        openButton = new JButton("Open");
        saveButton = new JButton("Save");
        findButton = new JButton("Find");
        textArea = new JTextArea();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(findButton);

        JScrollPane scrollPane = new JScrollPane(textArea);

        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void addOpenButtonListener(ActionListener listener) {
        openButton.addActionListener(listener);
    }

    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void addFindButtonListener(ActionListener listener) {
        findButton.addActionListener(listener);
    }

    public String getTextAreaContent() {
        return textArea.getText();
    }

    public void setTextAreaContent(String content) {
        textArea.setText(content);
    }

    public JButton getOpenButton() {
        return openButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getFindButton() {
        return findButton;
    }
}
