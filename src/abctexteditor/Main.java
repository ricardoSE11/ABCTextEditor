/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abctexteditor;

import abctexteditor.SaveClasses.FileSaver;
import abctexteditor.Resources.FileSaverPDF;

/**
 *
 * @author rshum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextEditorWindow textEditorWindow = new TextEditorWindow();
        textEditorWindow.setVisible(true);
        FileSaver saver = new FileSaverPDF();
        saver.SaveFile("test");
    }
    
}
