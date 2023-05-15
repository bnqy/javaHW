import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileHW10 extends JFrame implements ActionListener {


    
    private JButton uploadButton, downloadButton, saveButton;
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private File currentFile;

    
    public FileHW10() {
        super("file hw 9");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        uploadButton = new JButton("Upload");
        uploadButton.addActionListener(this);
        downloadButton = new JButton("Download");
        downloadButton.addActionListener(this);
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(100, 100 ));
        fileChooser = new JFileChooser();


       
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(uploadButton);
        panel.add(downloadButton);
        panel.add(saveButton);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

    
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent action) {
        
        if (action.getSource() == uploadButton) {
            int returningArgument = fileChooser.showOpenDialog(this);
            if (returningArgument == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                currentFile = file;
                try {
                    BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = bufferedreader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    bufferedreader.close();
                } catch (IOException exept) {
                    exept.printStackTrace();
                }
            }
        }

        
        if (action.getSource() == downloadButton) {
            int returningArgument = fileChooser.showSaveDialog(this);
            if (returningArgument == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file));
                    bufferedwriter.write(textArea.getText());
                    bufferedwriter.close();
                } catch (IOException exept) {
                    exept.printStackTrace();
                }
            }
        }

     
        if (action.getSource() == saveButton) {
            try {
                BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(currentFile));
                bufferedwriter.write(textArea.getText());
                bufferedwriter.close();
            } catch (IOException exept) {
                exept.printStackTrace();
            }
        }
    }
}
