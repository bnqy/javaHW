import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Controller implements ActionListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.addOpenButtonListener(this);
        this.view.addSaveButtonListener(this);
        this.view.addFindButtonListener(this);
    }

    //
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() instanceof JButton) {
            JButton source = (JButton) action.getSource();
            if (source == view.getOpenButton()) {
                openFile();
            } else if (source == view.getSaveButton()) {
                saveFile();
            } else if (source == view.getFindButton()) {
                findWord();
            }
        }
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(view);
        if (result == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getAbsolutePath();
            model.openFile(fileName);
            try {
                String fileContent = model.readFile();
                view.setTextAreaContent(fileContent);
            } catch (IOException except) {
                JOptionPane.showMessageDialog(view, "Error opening the file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(view);
        if (result == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getAbsolutePath();
            model.openFile(fileName);
            String fileContent = view.getTextAreaContent();
            try {
                model.writeFile(fileContent);
                JOptionPane.showMessageDialog(view, "Succesfully saved", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(view, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void findWord() {
        String word = JOptionPane.showInputDialog(view, "The word you want to find:");
        if (word != null && !word.isEmpty()) {
            try {
                int count = model.findWord(word);
                JOptionPane.showMessageDialog(view, "Words quantity '" + word + "': " + count,
                        "!", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException except) {
                JOptionPane.showMessageDialog(view, "Error ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
