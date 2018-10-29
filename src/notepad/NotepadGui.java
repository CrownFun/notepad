package notepad;

import editText.MyHighLightPainter;
import editText.TextSeeker;
import editText.UndoOperations;
import editText.WordCounter;
import editText.colourAndFonts.ColourAndFonts;
import editText.colourAndFonts.CutCopyPasteClear;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Highlighter;
import javax.swing.undo.UndoManager;
import loadAndSaveFile.LoadAndSaveFile;
import menu.AboutProgram;
import menu.ExitProgram;

public class NotepadGui extends javax.swing.JFrame {

    // resizable
    public NotepadGui() {
        initComponents();
    }

    public File file;
    public String text;
    Clipboard clip = getToolkit().getSystemClipboard();

    Highlighter.HighlightPainter myHighLight = new MyHighLightPainter(Color.red);
    UndoOperations undo = new UndoOperations();
    UndoManager manager = new UndoManager();
    LoadAndSaveFile loadAndSave = new LoadAndSaveFile();
    TextSeeker textSeeker = new TextSeeker();
    WordCounter wordCounter = new WordCounter();
    ExitProgram exitProgram;
    AboutProgram aboutProgram;
    CutCopyPasteClear cutCopyPasteClear = new CutCopyPasteClear();
    ColourAndFonts colorAndFonts = new ColourAndFonts();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        ppCopy = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ppCut = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ppPaste = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        ppDelete = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        ppSelect = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        buttonSave = new javax.swing.JButton();
        buttonSaveAs = new javax.swing.JButton();
        buttonLoad = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonSelect = new javax.swing.JButton();
        buttonFontColour = new javax.swing.JButton();
        buttonBackgroundColour = new javax.swing.JButton();
        buttonBold = new javax.swing.JButton();
        buttonItalic = new javax.swing.JButton();
        buttonPlainText = new javax.swing.JButton();
        ComboBoxFont = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxFontSize = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        notepad = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        buttonSearch = new javax.swing.JButton();
        buttonCleanSearching = new javax.swing.JButton();
        labelSeeking = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelCountWords = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemNew = new javax.swing.JMenuItem();
        MenuItemOpenFile = new javax.swing.JMenuItem();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemsaveAs = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemBack = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemCut = new javax.swing.JMenuItem();
        menuItemCopy = new javax.swing.JMenuItem();
        menuItemPaste = new javax.swing.JMenuItem();
        menuItemSelectText = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemDeleteText = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuItemAboutProgram = new javax.swing.JMenuItem();

        ppCopy.setText("Kopiuj");
        ppCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppCopyActionPerformed(evt);
            }
        });
        jPopupMenu2.add(ppCopy);
        jPopupMenu2.add(jSeparator5);

        ppCut.setText("Wytnij");
        ppCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppCutActionPerformed(evt);
            }
        });
        jPopupMenu2.add(ppCut);
        jPopupMenu2.add(jSeparator6);

        ppPaste.setText("Wklej");
        ppPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppPasteActionPerformed(evt);
            }
        });
        jPopupMenu2.add(ppPaste);
        jPopupMenu2.add(jSeparator7);

        ppDelete.setText("Usuń");
        ppDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppDeleteActionPerformed(evt);
            }
        });
        jPopupMenu2.add(ppDelete);
        jPopupMenu2.add(jSeparator8);

        ppSelect.setText("Zaznacz wszystko");
        ppSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppSelectActionPerformed(evt);
            }
        });
        jPopupMenu2.add(ppSelect);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Notepad");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(910, 517));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        toolBar.setBorder(null);
        toolBar.setFloatable(false);
        toolBar.setRollover(true);
        toolBar.setPreferredSize(new java.awt.Dimension(900, 44));

        buttonSave.setBackground(new java.awt.Color(12, 69, 96));
        buttonSave.setForeground(new java.awt.Color(12, 69, 96));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        buttonSave.setToolTipText("Zapisz");
        buttonSave.setFocusable(false);
        buttonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        toolBar.add(buttonSave);

        buttonSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-as-icon.png"))); // NOI18N
        buttonSaveAs.setToolTipText("Zapisz Jako...");
        buttonSaveAs.setFocusable(false);
        buttonSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveAsActionPerformed(evt);
            }
        });
        toolBar.add(buttonSaveAs);

        buttonLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Folder-Open-icon.png"))); // NOI18N
        buttonLoad.setToolTipText("Wczytaj");
        buttonLoad.setFocusable(false);
        buttonLoad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLoad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonLoadMouseReleased(evt);
            }
        });
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });
        toolBar.add(buttonLoad);

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-icon.png"))); // NOI18N
        buttonBack.setToolTipText("Cofnij");
        buttonBack.setFocusable(false);
        buttonBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        toolBar.add(buttonBack);

        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-icon.png"))); // NOI18N
        buttonClear.setToolTipText("Czyść");
        buttonClear.setFocusable(false);
        buttonClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        toolBar.add(buttonClear);

        buttonSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cursor-Select-icon.png"))); // NOI18N
        buttonSelect.setToolTipText("Zaznacz tekst");
        buttonSelect.setFocusable(false);
        buttonSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectActionPerformed(evt);
            }
        });
        toolBar.add(buttonSelect);

        buttonFontColour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/select-font-icon (1).png"))); // NOI18N
        buttonFontColour.setToolTipText("Kolor czcionki");
        buttonFontColour.setFocusable(false);
        buttonFontColour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonFontColour.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonFontColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFontColourActionPerformed(evt);
            }
        });
        toolBar.add(buttonFontColour);

        buttonBackgroundColour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-color.png"))); // NOI18N
        buttonBackgroundColour.setToolTipText("Kolor tła");
        buttonBackgroundColour.setFocusable(false);
        buttonBackgroundColour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBackgroundColour.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonBackgroundColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackgroundColourActionPerformed(evt);
            }
        });
        toolBar.add(buttonBackgroundColour);

        buttonBold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bold-text.png"))); // NOI18N
        buttonBold.setToolTipText("Pogrubienie");
        buttonBold.setFocusable(false);
        buttonBold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBold.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoldActionPerformed(evt);
            }
        });
        toolBar.add(buttonBold);

        buttonItalic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/italic-text.png"))); // NOI18N
        buttonItalic.setToolTipText("Kursywa");
        buttonItalic.setFocusable(false);
        buttonItalic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonItalic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItalicActionPerformed(evt);
            }
        });
        toolBar.add(buttonItalic);

        buttonPlainText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plain.png"))); // NOI18N
        buttonPlainText.setToolTipText("Normalny");
        buttonPlainText.setFocusable(false);
        buttonPlainText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPlainText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonPlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlainTextActionPerformed(evt);
            }
        });
        toolBar.add(buttonPlainText);

        String font[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        String dupa[] = {"dupa","cipa","gówno", "cycki"};
        ComboBoxFont.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ComboBoxFont.setMaximumRowCount(15);
        ComboBoxFont.setModel(new javax.swing.DefaultComboBoxModel<>(font));
        ComboBoxFont.setToolTipText("Czcionka");
        ComboBoxFont.setPreferredSize(new java.awt.Dimension(150, 25));
        ComboBoxFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFontActionPerformed(evt);
            }
        });
        ComboBoxFont.setSelectedIndex(36);
        toolBar.add(ComboBoxFont);
        toolBar.add(jLabel1);

        ComboBoxFontSize.setEditable(true);
        ComboBoxFontSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "42", "52", "64", "72" }));
        ComboBoxFontSize.setSelectedIndex(12);
        ComboBoxFontSize.setToolTipText("Rozmiar Czcionki");
        ComboBoxFontSize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboBoxFontSize.setPreferredSize(new java.awt.Dimension(50, 26));
        ComboBoxFontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFontSizeActionPerformed(evt);
            }
        });
        toolBar.add(ComboBoxFontSize);

        jPanel1.add(toolBar);
        toolBar.setBounds(0, 0, 900, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        notepad.setBackground(new java.awt.Color(255, 255, 255));
        notepad.setColumns(20);
        notepad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        notepad.setForeground(new java.awt.Color(0, 0, 0));
        notepad.setLineWrap(true);
        notepad.setRows(5);
        notepad.setWrapStyleWord(true);
        notepad.setBorder(null);
        notepad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        notepad.setMinimumSize(new java.awt.Dimension(0, 0));
        notepad.setPreferredSize(new java.awt.Dimension(5000, 5000));
        notepad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notepadMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                notepadMouseReleased(evt);
            }
        });
        notepad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notepadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notepadKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(notepad);
        notepad.setBounds(0, 40, 2000, 2000);

        notepad.getDocument().addUndoableEditListener(
            new UndoableEditListener() {
                public void undoableEditHappened(UndoableEditEvent e) {
                    manager.addEdit(e.getEdit());
                }

            });

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(0, 40, 900, 380);

            jToolBar1.setBorder(null);
            jToolBar1.setFloatable(false);
            jToolBar1.setRollover(true);
            jToolBar1.setBorderPainted(false);

            buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
            buttonSearch.setToolTipText("Szukaj w tekście");
            buttonSearch.setFocusable(false);
            buttonSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            buttonSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            buttonSearch.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonSearchActionPerformed(evt);
                }
            });
            buttonSearch.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    buttonSearchKeyPressed(evt);
                }
            });
            jToolBar1.add(buttonSearch);

            buttonCleanSearching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-icon3.png"))); // NOI18N
            buttonCleanSearching.setToolTipText("Wyczyść wyszukiwanie");
            buttonCleanSearching.setFocusable(false);
            buttonCleanSearching.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            buttonCleanSearching.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            buttonCleanSearching.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonCleanSearchingActionPerformed(evt);
                }
            });
            jToolBar1.add(buttonCleanSearching);

            jPanel1.add(jToolBar1);
            jToolBar1.setBounds(0, 420, 80, 40);

            labelSeeking.setBackground(new java.awt.Color(255, 255, 255));
            labelSeeking.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
            labelSeeking.setForeground(new java.awt.Color(0, 0, 0));
            labelSeeking.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    labelSeekingActionPerformed(evt);
                }
            });
            labelSeeking.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    labelSeekingKeyPressed(evt);
                }
            });
            jPanel1.add(labelSeeking);
            labelSeeking.setBounds(80, 420, 100, 30);

            jLabel2.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(102, 102, 102));
            jLabel2.setText("ilość wyrazów:");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(750, 420, 90, 30);

            labelCountWords.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
            jPanel1.add(labelCountWords);
            labelCountWords.setBounds(840, 420, 40, 30);

            getContentPane().add(jPanel1);
            jPanel1.setBounds(0, 0, 900, 600);

            jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
            jMenuBar1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
            jMenuBar1.setOpaque(true);

            jMenu1.setBackground(new java.awt.Color(12, 69, 96));
            jMenu1.setForeground(new java.awt.Color(0, 0, 0));
            jMenu1.setText("Plik");
            jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

            MenuItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
            MenuItemNew.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemNew.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemNew.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemNew.setText("Nowy");
            MenuItemNew.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MenuItemNewActionPerformed(evt);
                }
            });
            jMenu1.add(MenuItemNew);

            MenuItemOpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
            MenuItemOpenFile.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemOpenFile.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemOpenFile.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemOpenFile.setText("Otwórz");
            MenuItemOpenFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MenuItemOpenFileActionPerformed(evt);
                }
            });
            jMenu1.add(MenuItemOpenFile);

            MenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
            MenuItemSave.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemSave.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemSave.setText("Zapisz");
            MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MenuItemSaveActionPerformed(evt);
                }
            });
            jMenu1.add(MenuItemSave);

            MenuItemsaveAs.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemsaveAs.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemsaveAs.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemsaveAs.setText("Zapisz jako...");
            MenuItemsaveAs.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MenuItemsaveAsActionPerformed(evt);
                }
            });
            jMenu1.add(MenuItemsaveAs);
            jMenu1.add(jSeparator4);

            menuItemExit.setBackground(new java.awt.Color(12, 69, 96));
            menuItemExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemExit.setForeground(new java.awt.Color(0, 0, 0));
            menuItemExit.setText("Zakończ");
            menuItemExit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemExitActionPerformed(evt);
                }
            });
            jMenu1.add(menuItemExit);

            jMenuBar1.add(jMenu1);

            jMenu2.setBackground(new java.awt.Color(12, 69, 96));
            jMenu2.setForeground(new java.awt.Color(0, 0, 0));
            jMenu2.setText("Edycja");
            jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

            MenuItemBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
            MenuItemBack.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemBack.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemBack.setText("Cofnij");
            jMenu2.add(MenuItemBack);
            jMenu2.add(jSeparator3);

            menuItemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
            menuItemCut.setBackground(new java.awt.Color(12, 69, 96));
            menuItemCut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemCut.setForeground(new java.awt.Color(0, 0, 0));
            menuItemCut.setText("Wytnij");
            menuItemCut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemCutActionPerformed(evt);
                }
            });
            jMenu2.add(menuItemCut);

            menuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
            menuItemCopy.setBackground(new java.awt.Color(12, 69, 96));
            menuItemCopy.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemCopy.setForeground(new java.awt.Color(0, 0, 0));
            menuItemCopy.setText("Kopiuj");
            menuItemCopy.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemCopyActionPerformed(evt);
                }
            });
            jMenu2.add(menuItemCopy);

            menuItemPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
            menuItemPaste.setBackground(new java.awt.Color(12, 69, 96));
            menuItemPaste.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemPaste.setForeground(new java.awt.Color(0, 0, 0));
            menuItemPaste.setText("Wklej");
            menuItemPaste.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemPasteActionPerformed(evt);
                }
            });
            jMenu2.add(menuItemPaste);

            menuItemSelectText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
            menuItemSelectText.setBackground(new java.awt.Color(12, 69, 96));
            menuItemSelectText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemSelectText.setForeground(new java.awt.Color(0, 0, 0));
            menuItemSelectText.setText("Zaznacz wszystko");
            menuItemSelectText.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemSelectTextActionPerformed(evt);
                }
            });
            jMenu2.add(menuItemSelectText);
            jMenu2.add(jSeparator2);

            menuItemDeleteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
            menuItemDeleteText.setBackground(new java.awt.Color(12, 69, 96));
            menuItemDeleteText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            menuItemDeleteText.setForeground(new java.awt.Color(0, 0, 0));
            menuItemDeleteText.setText("Usuń");
            menuItemDeleteText.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuItemDeleteTextActionPerformed(evt);
                }
            });
            jMenu2.add(menuItemDeleteText);

            jMenuBar1.add(jMenu2);

            jMenu4.setBackground(new java.awt.Color(12, 69, 96));
            jMenu4.setForeground(new java.awt.Color(0, 0, 0));
            jMenu4.setText("Pomoc");
            jMenu4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

            MenuItemAboutProgram.setBackground(new java.awt.Color(12, 69, 96));
            MenuItemAboutProgram.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            MenuItemAboutProgram.setForeground(new java.awt.Color(0, 0, 0));
            MenuItemAboutProgram.setText("O programie");
            MenuItemAboutProgram.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MenuItemAboutProgramActionPerformed(evt);
                }
            });
            jMenu4.add(MenuItemAboutProgram);

            jMenuBar1.add(jMenu4);

            setJMenuBar(jMenuBar1);

            pack();
        }// </editor-fold>//GEN-END:initComponents


    private void MenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewActionPerformed
        cutCopyPasteClear.createNewFile(notepad, labelSeeking, labelCountWords);
    }//GEN-LAST:event_MenuItemNewActionPerformed


    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        exitProgram = new ExitProgram();
        exitProgram.closingProgram(notepad, file);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void MenuItemAboutProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAboutProgramActionPerformed
        aboutProgram = new AboutProgram();
        aboutProgram.aboutProgram();

    }//GEN-LAST:event_MenuItemAboutProgramActionPerformed

    private void ppSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppSelectActionPerformed
        notepad.selectAll();
    }//GEN-LAST:event_ppSelectActionPerformed

    private void ppCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppCopyActionPerformed
        cutCopyPasteClear.copyText(notepad, clip);
    }//GEN-LAST:event_ppCopyActionPerformed

    private void ppPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppPasteActionPerformed
        cutCopyPasteClear.pasteText(clip, notepad);
    }//GEN-LAST:event_ppPasteActionPerformed

    private void ppDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppDeleteActionPerformed
        cutCopyPasteClear.deleteText(notepad);
    }//GEN-LAST:event_ppDeleteActionPerformed

    private void ppCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppCutActionPerformed
        cutCopyPasteClear.cutText(notepad, clip);
    }//GEN-LAST:event_ppCutActionPerformed

    private void notepadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notepadMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu2.show(this, evt.getX(), evt.getY());
        }
        wordCounter.CountingWordsInText(notepad, labelCountWords);
    }//GEN-LAST:event_notepadMouseReleased

    private void ComboBoxFontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFontSizeActionPerformed
        colorAndFonts.setFontSize(ComboBoxFontSize, notepad);
    }//GEN-LAST:event_ComboBoxFontSizeActionPerformed


    private void ComboBoxFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFontActionPerformed
        colorAndFonts.setFont(ComboBoxFont, notepad);
    }//GEN-LAST:event_ComboBoxFontActionPerformed

    private void buttonPlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlainTextActionPerformed
        colorAndFonts.setPlainFont(notepad);
    }//GEN-LAST:event_buttonPlainTextActionPerformed

    private void buttonItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonItalicActionPerformed
        colorAndFonts.setItalicFont(notepad);
    }//GEN-LAST:event_buttonItalicActionPerformed


    private void buttonBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBoldActionPerformed
        colorAndFonts.setBoldFont(notepad);
    }//GEN-LAST:event_buttonBoldActionPerformed

    private void buttonBackgroundColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackgroundColourActionPerformed

        colorAndFonts.setBackgroundColor(notepad);
    }//GEN-LAST:event_buttonBackgroundColourActionPerformed

    private void buttonFontColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFontColourActionPerformed

        colorAndFonts.setFontColor(notepad);
    }//GEN-LAST:event_buttonFontColourActionPerformed

    private void buttonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectActionPerformed
        notepad.selectAll();
    }//GEN-LAST:event_buttonSelectActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        cutCopyPasteClear.clearFields(notepad, labelSeeking);
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        undo.undoOperation(manager, buttonBack);
    }//GEN-LAST:event_buttonBackActionPerformed


    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
        labelSeeking.setText("");
        loadAndSave.openFile(notepad, file, this);
    }//GEN-LAST:event_buttonLoadActionPerformed


    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed

        loadAndSave.saveFile(file, notepad);
    }//GEN-LAST:event_buttonSaveActionPerformed


    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        if (!labelSeeking.getText().equals("")) {

            textSeeker.searchingText(notepad, labelSeeking, (MyHighLightPainter) myHighLight);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed


    private void labelSeekingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelSeekingActionPerformed

    }//GEN-LAST:event_labelSeekingActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitProgram = new ExitProgram();
        exitProgram.closingProgram(notepad, file);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void buttonSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveAsActionPerformed
        loadAndSave.saveAs(notepad, file);
    }//GEN-LAST:event_buttonSaveAsActionPerformed


    private void MenuItemOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpenFileActionPerformed
        loadAndSave.openFile(notepad, file, this);
    }//GEN-LAST:event_MenuItemOpenFileActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        loadAndSave.saveFile(file, notepad);

    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void MenuItemsaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemsaveAsActionPerformed
        loadAndSave.saveAs(notepad, file);
    }//GEN-LAST:event_MenuItemsaveAsActionPerformed

    private void menuItemDeleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeleteTextActionPerformed
        cutCopyPasteClear.deleteText(notepad);
    }//GEN-LAST:event_menuItemDeleteTextActionPerformed

    private void menuItemSelectTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSelectTextActionPerformed
        notepad.selectAll();
    }//GEN-LAST:event_menuItemSelectTextActionPerformed

    private void menuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPasteActionPerformed
        cutCopyPasteClear.pasteText(clip, notepad);
    }//GEN-LAST:event_menuItemPasteActionPerformed


    private void menuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopyActionPerformed
        cutCopyPasteClear.copyText(notepad, clip);
    }//GEN-LAST:event_menuItemCopyActionPerformed

    private void menuItemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCutActionPerformed
        cutCopyPasteClear.cutText(notepad, clip);
    }//GEN-LAST:event_menuItemCutActionPerformed

    private void notepadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notepadKeyPressed
        wordCounter.CountingWordsInText(notepad, labelCountWords);
    }//GEN-LAST:event_notepadKeyPressed

    private void notepadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notepadMousePressed
        wordCounter.CountingWordsInText(notepad, labelCountWords);
    }//GEN-LAST:event_notepadMousePressed

    private void notepadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notepadKeyReleased
        wordCounter.CountingWordsInText(notepad, labelCountWords);
    }//GEN-LAST:event_notepadKeyReleased

    private void buttonLoadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoadMouseReleased
        wordCounter.CountingWordsInText(notepad, labelCountWords);
    }//GEN-LAST:event_buttonLoadMouseReleased

    private void buttonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSearchKeyPressed

    }//GEN-LAST:event_buttonSearchKeyPressed

    private void labelSeekingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelSeekingKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!labelSeeking.getText().equals("")) {
                textSeeker.searchingText(notepad, labelSeeking, (MyHighLightPainter) myHighLight);
            }
        }
    }//GEN-LAST:event_labelSeekingKeyPressed

    private void buttonCleanSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanSearchingActionPerformed
        textSeeker.closeSearchingText(notepad, labelSeeking, (MyHighLightPainter) myHighLight);
    }//GEN-LAST:event_buttonCleanSearchingActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NotepadGui().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFont;
    private javax.swing.JComboBox<String> ComboBoxFontSize;
    private javax.swing.JMenuItem MenuItemAboutProgram;
    private javax.swing.JMenuItem MenuItemBack;
    private javax.swing.JMenuItem MenuItemNew;
    private javax.swing.JMenuItem MenuItemOpenFile;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JMenuItem MenuItemsaveAs;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonBackgroundColour;
    private javax.swing.JButton buttonBold;
    private javax.swing.JButton buttonCleanSearching;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonFontColour;
    private javax.swing.JButton buttonItalic;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonPlainText;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSaveAs;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelCountWords;
    private javax.swing.JTextField labelSeeking;
    private javax.swing.JMenuItem menuItemCopy;
    private javax.swing.JMenuItem menuItemCut;
    private javax.swing.JMenuItem menuItemDeleteText;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemPaste;
    private javax.swing.JMenuItem menuItemSelectText;
    private javax.swing.JTextArea notepad;
    private javax.swing.JMenuItem ppCopy;
    private javax.swing.JMenuItem ppCut;
    private javax.swing.JMenuItem ppDelete;
    private javax.swing.JMenuItem ppPaste;
    private javax.swing.JMenuItem ppSelect;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
