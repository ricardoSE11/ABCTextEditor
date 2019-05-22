package abctexteditor.Files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


/**
 *
 * @author juanj
 */
public class FileSaverPDF implements IFileFormat{
    
    public FileSaverPDF() {
    }
    
    
    public boolean SaveFile(String text) {
        try {
            try (PDDocument document = new PDDocument()) {
                PDPage page = new PDPage();
                document.addPage(page);
                
                PDPageContentStream contentStream = new PDPageContentStream(document, page);
                
                contentStream.setFont(PDType1Font.COURIER, 12);
                contentStream.beginText();
                contentStream.showText("Hello World");
                contentStream.endText();
                contentStream.close();
                
                document.save("pdfBoxHelloWorld.pdf");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileSaverPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public String applyFormat(String fileContent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String removeFormat(String fileContent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
