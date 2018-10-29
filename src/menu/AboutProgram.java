package menu;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AboutProgram {

    public void aboutProgram() throws HeadlessException {
        JOptionPane.showMessageDialog(null,
                "Program \"Notatnik\" służący do tworzenia i edytowania notatek tekstowych. Najważniejsze funkcje:\n-Odczyt i Zapis do Pliku\n-Odnajdywanie frazy w tekście\n"
                + "-Dynamiczny licznik wyrazów\n-Cofanie operacji\n-Formatowanie czcionki.\n\n\nAutor: Grzegorz Filewicz,\nLublin , 10 Luty 2018",
                "INFO", JOptionPane.INFORMATION_MESSAGE);
    }
}
