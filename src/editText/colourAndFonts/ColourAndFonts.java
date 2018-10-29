package editText.colourAndFonts;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ColourAndFonts {

    public void setBackgroundColor(JTextArea TextArea) throws HeadlessException {
        Color a = JColorChooser.showDialog(null, "Kolor tła", Color.BLACK);
        TextArea.setBackground(a);
    }

    public void setFontColor(JTextArea textArea) throws HeadlessException {
        Color a = JColorChooser.showDialog(null, "Kolor Czcionki", Color.BLACK);
        textArea.setForeground(a);
    }

    public void setFontSize(JComboBox ComboBox, JTextArea textArea) throws NumberFormatException {

        textArea.setFont(textArea.getFont().deriveFont(Float.parseFloat((String) ComboBox.getSelectedItem())));
    }

    public void setFont(JComboBox combo, JTextArea textArea) {
        textArea.setFont(new Font((String) (combo.getSelectedItem()), textArea.getFont().getStyle(), textArea.getFont().getSize()));
    }

    public void setPlainFont(JTextArea textArea) {
        textArea.setFont(textArea.getFont().deriveFont(Font.PLAIN));
    }

    public void setItalicFont(JTextArea textArea) {
        textArea.setFont(textArea.getFont().deriveFont(Font.ITALIC));
    }

    public void setBoldFont(JTextArea textArea) {
        textArea.setFont(textArea.getFont().deriveFont(Font.BOLD));
    }

}
