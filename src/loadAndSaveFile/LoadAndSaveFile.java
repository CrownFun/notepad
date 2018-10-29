package loadAndSaveFile;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class LoadAndSaveFile {


    public LoadAndSaveFile() {
    }

    public void openFile(JTextArea textArea, File file, JFrame frame) throws HeadlessException {
        textArea.setText("");
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            try {
                Scanner scan = new Scanner(file);
                while (scan.hasNext()) {
                    textArea.append(scan.nextLine() + "\n");
                }
                frame.setTitle(fc.getName(file));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void saveAs(JTextArea textArea, File file) throws HeadlessException {
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(file);
        if (fc.showSaveDialog(textArea) == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            try {
                PrintWriter pw = new PrintWriter(file);
                Scanner scaner = new Scanner(textArea.getText());
                while (scaner.hasNext()) {
                    pw.println(scaner.nextLine());
                }
                scaner.close();
                pw.close();

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

        }
    }

    public void saveFile(File file, JTextArea textArea) {
        try {
            PrintWriter pw = new PrintWriter(file);
            Scanner scaner = new Scanner(textArea.getText());
            while (scaner.hasNext()) {
                pw.println(scaner.nextLine());
            }
            scaner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
