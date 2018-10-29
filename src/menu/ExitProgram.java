package menu;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import loadAndSaveFile.LoadAndSaveFile;

public class ExitProgram {

    LoadAndSaveFile loadAndSave = new LoadAndSaveFile();

    public void closingProgram(JTextArea textArea, File file) throws HeadlessException {
        Object[] opcje = {"Zapisz", "Wyjście", "Anuluj"};
        int odp = JOptionPane.showOptionDialog(null, "Czy napewno chcesz wyjść? - nie zapisane zmiany zostaną utracone", "Notatnik", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcje, opcje[1]);
        switch (odp) {
            case 0:
                loadAndSave.saveAs(textArea, file);
                break;
            case 1:
                System.exit(0);
            case 3:
                break;
            default:
                break;
        }
    }


}
