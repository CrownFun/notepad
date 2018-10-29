package editText;

import java.util.StringTokenizer;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class WordCounter {

    public void CountingWordsInText(JTextArea textArea, JLabel label) {
        String text = textArea.getText();
        int WordCounter = new StringTokenizer(text).countTokens();
        label.setText(String.valueOf(WordCounter));
    }
}
