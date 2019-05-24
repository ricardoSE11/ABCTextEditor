/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abctexteditor;

import abctexteditor.Files.FileExtension;
import abctexteditor.Files.FileFormatter;
import abctexteditor.Utils.Paragraph;
import abctexteditor.Utils.StringHandler;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.StyledDocument;
import javax.swing.undo.UndoManager;


/**
 *
 * @author rshum
 */
public class TextEditorWindow extends javax.swing.JFrame {

    private final String windowTitle = "ABC Text Editor";
    
    private File currentFile;
    private String fileName; 
    private FileFormatter fileFormatter;
    
    private UndoManager undoManager = new UndoManager();
    private ChangesDocumentListener documentListener = new ChangesDocumentListener();
    private StyledDocument document;
    
    public TextEditorWindow() {
        initComponents();
        this.document = textArea.getStyledDocument();
        document.addUndoableEditListener(undoManager);
        document.addDocumentListener(documentListener);
        fileFormatter = new FileFormatter();
        // Set up UI
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            this.setTitle(windowTitle);
            Image editorIcon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Resources/abc.png"));
            setIcon(editorIcon);
        } 
        catch (Exception e) {
            System.out.println("Error while setting up system look and feel: " + e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemNew = new javax.swing.JMenuItem();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemSaveAs = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuItemUndo = new javax.swing.JMenuItem();
        menuItemRedo = new javax.swing.JMenuItem();
        menuItemCut = new javax.swing.JMenuItem();
        menuItemCopy = new javax.swing.JMenuItem();
        menuItemPaste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));

        panelMain.setBackground(new java.awt.Color(47, 53, 66));

        textArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(textArea);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuFile.setText("File");

        menuItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/file.png"))); // NOI18N
        menuItemNew.setText("New");
        menuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewActionPerformed(evt);
            }
        });
        menuFile.add(menuItemNew);

        menuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/folder.png"))); // NOI18N
        menuItemOpen.setText("Open");
        menuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuItemOpen);

        menuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/save.png"))); // NOI18N
        menuItemSave.setText("Save");
        menuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSave);

        menuItemSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/diskette.png"))); // NOI18N
        menuItemSaveAs.setText("Save as");
        menuItemSaveAs.setToolTipText("");
        menuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSaveAs);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");

        menuItemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/undo.png"))); // NOI18N
        menuItemUndo.setText("Undo");
        menuItemUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUndoActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemUndo);

        menuItemRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/redo.png"))); // NOI18N
        menuItemRedo.setText("Redo");
        menuItemRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRedoActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemRedo);

        menuItemCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/scissors.png"))); // NOI18N
        menuItemCut.setText("Cut");
        menuItemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCutActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemCut);

        menuItemCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/copy.png"))); // NOI18N
        menuItemCopy.setText("Copy");
        menuItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCopyActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemCopy);

        menuItemPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abctexteditor/Resources/paste-as-text.png"))); // NOI18N
        menuItemPaste.setText("Paste");
        menuItemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPasteActionPerformed(evt);
            }
        });
        menuEdit.add(menuItemPaste);

        jMenuBar1.add(menuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // FIXME
    private void menuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewActionPerformed
        if (currentFile != null && documentListener.detectedChanges()){ // Missing attribute that checks if it has been changed 
            int choosenOption = JOptionPane.showConfirmDialog(null, "Do you want to save before closing?", "Wait!" , JOptionPane.YES_NO_OPTION);
            if (choosenOption == JOptionPane.YES_OPTION){
                saveFile();
            }
        }
        currentFile = null;
        textArea.setText("");
        setTitle("New file");
    }//GEN-LAST:event_menuItemNewActionPerformed

    private void menuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenActionPerformed
        openFile();
    }//GEN-LAST:event_menuItemOpenActionPerformed

    private void menuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveActionPerformed
        saveFile();
    
    }//GEN-LAST:event_menuItemSaveActionPerformed

    private void menuItemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCutActionPerformed
        Clipboard clipBoard = getToolkit().getSystemClipboard(); // Used to cut,copy and paste functions
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipBoard.setContents(cutSelection, cutSelection);
        textArea.replaceSelection("");
    }//GEN-LAST:event_menuItemCutActionPerformed

    private void menuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPasteActionPerformed
        try {
            textArea.paste();
        } 
        catch (Exception e) {
            System.out.println("Error while trying to paste text: " + e.getMessage());
        }
    }//GEN-LAST:event_menuItemPasteActionPerformed

    private void menuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopyActionPerformed
        Clipboard clipBoard = getToolkit().getSystemClipboard(); // Used to cut,copy and paste functions
        String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipBoard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_menuItemCopyActionPerformed

    private void menuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveAsActionPerformed
        saveFileFirstTime();
    }//GEN-LAST:event_menuItemSaveAsActionPerformed

    private void menuItemUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUndoActionPerformed
        if(undoManager.canUndo()){
            undoManager.undo();
            //System.out.println("Editor log: Trying to UNDO an action");
        }
    }//GEN-LAST:event_menuItemUndoActionPerformed

    private void menuItemRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRedoActionPerformed
        if (undoManager.canRedo()) {
            undoManager.redo();
            //System.out.println("Editor log: Trying to REDO an action");
        }
    }//GEN-LAST:event_menuItemRedoActionPerformed

    public void saveFile(){
        try {
            if (currentFile == null){
                saveFileFirstTime();
            }
            else{
                String fileContent = textArea.getText();
                fileName = currentFile.getName();
  
                String fileExtension = getFileExtension(fileName).toUpperCase();
                FileExtension extension = FileExtension.valueOf(fileExtension);
                String formattedText = fileFormatter.formatFile(fileContent, extension);
                
                FileWriter fileWriter = new FileWriter(currentFile);
                fileWriter.write(formattedText);
                this.setTitle(windowTitle + " - " + fileName);
                fileWriter.close();

                System.out.println("Editor log: Succesfully saved the file " + fileName);
            }

        } 
        
        catch (Exception e) {
        }
    }
    
    public void saveFileFirstTime(){
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save file");
            fileChooser.showSaveDialog(null);

            currentFile = fileChooser.getSelectedFile();
            
            // This is to validate if the save was not cancelled.
            if (currentFile != null){
                saveFile(); 
                
            }

            
            System.out.println("Editor log: Succesfully saved for the first time file " + fileName);
        } catch (Exception e) {
        }
    }
    
    public void openFile(){
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select a file to open");
            fileChooser.showOpenDialog(null);

            currentFile = fileChooser.getSelectedFile();
            if (!currentFile.exists()) {
                currentFile = null;
                JOptionPane.showMessageDialog(null, "Failed to open the file" , "Error" , JOptionPane.ERROR_MESSAGE);
                return;
            }

            Scanner reader = new Scanner(currentFile);
            String fileContent = "";
            while (reader.hasNextLine()) {
                fileContent += reader.nextLine() + "\n";
            }
            reader.close();            
            
//            ArrayList<Paragraph> ps = StringHandler.getParagraphs(fileContent);
//            for (int i = 0; i < ps.size(); i++) {
//                System.out.println("P# " + i);
//                System.out.println(ps.get(i).getText());
//            }
            
            fileName = currentFile.getName();
            String fileExtension = getFileExtension(fileName).toUpperCase();
            
            FileExtension extension = FileExtension.valueOf(fileExtension);
            
            String unformattedText = fileFormatter.unformatFile(fileContent, extension);
            //System.out.println("FT: " + formattedText);
            
            
            textArea.setText(unformattedText);
            this.setTitle(windowTitle + " - " + fileName);
            

            
        } catch (Exception e) {
        }
    }
    
    public void setIcon(Image image){
        setIconImage(image);
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Resources/abc.png")));
    }

    public String getFileExtension(String filename){
        String fileExtension = "";
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex > 0){
            fileExtension = filename.substring(dotIndex + 1);
        }
        return fileExtension;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemCopy;
    private javax.swing.JMenuItem menuItemCut;
    private javax.swing.JMenuItem menuItemNew;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JMenuItem menuItemPaste;
    private javax.swing.JMenuItem menuItemRedo;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JMenuItem menuItemSaveAs;
    private javax.swing.JMenuItem menuItemUndo;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextPane textArea;
    // End of variables declaration//GEN-END:variables
}
