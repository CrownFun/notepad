package editText;

import javax.swing.JButton;
import javax.swing.undo.UndoManager;

public class UndoOperations {

  

    public void undoOperation(UndoManager manager, JButton button) {
        if (manager.canUndo()) {
            button.setEnabled(true);
            manager.undo();
        }
    }

}
