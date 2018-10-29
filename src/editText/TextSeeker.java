package editText;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;

public class TextSeeker {
    
    public void searchingText(JTextArea notepad, JTextField labelSeeking, MyHighLightPainter myHighLight) {
        Highlighter hili = notepad.getHighlighter();
        Highlighter.Highlight[] hilites = hili.getHighlights();
        
        for (Highlighter.Highlight hilite : hilites) {
            if (hilite.getPainter() instanceof MyHighLightPainter) {
                hili.removeHighlight(hilite);
            }
        }
        try {
            Highlighter hilite = notepad.getHighlighter();
            Document doc = notepad.getDocument();
            String text = notepad.getText(0, doc.getLength());
            int pos = 0;
            
            while ((pos = text.toUpperCase().indexOf(labelSeeking.getText().toUpperCase(), pos)) >= 0) {
                hilite.addHighlight(pos, pos + labelSeeking.getText().length(), myHighLight);
                
                pos += labelSeeking.getText().length();
            }
        } catch (BadLocationException e) {
            
        }
    }
    
    public void closeSearchingText(JTextArea notepad, JTextField labelSeeking, MyHighLightPainter myHighLight) {
        
        Highlighter hilite = notepad.getHighlighter();
        hilite.removeAllHighlights();
        labelSeeking.setText("");
        
    }
}
