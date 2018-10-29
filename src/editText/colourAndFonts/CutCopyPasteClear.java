package editText.colourAndFonts;

import java.awt.Color;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import notepad.NotepadGui;

public class CutCopyPasteClear {
    
    public void copyText(JTextArea notepad, Clipboard clip) {
        String selection = notepad.getSelectedText();
        StringSelection clipSelection = new StringSelection(selection);
        clip.setContents(clipSelection, clipSelection);
    }
    
    public void pasteText(Clipboard clip, JTextArea textArea) {
        Transferable clipPaste = clip.getContents(textArea);
        try {
            if (clipPaste.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String s = (String) clipPaste.getTransferData(DataFlavor.stringFlavor);
                textArea.replaceSelection(s);
            }
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(NotepadGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteText(JTextArea textArea) {
        textArea.setText(textArea.getText().replace(textArea.getSelectedText(), ""));
    }
    
    public void cutText(JTextArea textArea, Clipboard clip) {
        String selection = textArea.getSelectedText();
        StringSelection data = new StringSelection(selection);
        clip.setContents(data, data);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }
    
    public void clearFields(JTextArea textArea, JTextField textField) {
        textArea.setText("");
        textField.setText("");
    }
    
    public void createNewFile(JTextArea textArea, JTextField textfield, JLabel label) {
        textArea.setText("");
        textArea.setBackground(Color.WHITE);
        textfield.setText("");
        label.setText("");
    }
}
