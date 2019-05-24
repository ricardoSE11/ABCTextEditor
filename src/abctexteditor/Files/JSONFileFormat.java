
package abctexteditor.Files;

import abctexteditor.Utils.Paragraph;
import abctexteditor.Utils.StringHandler;
import java.util.ArrayList;


public class JSONFileFormat implements IFileFormat{

    public JSONFileFormat() {
    }

    
    @Override
    public String applyFormat(String fileContent) {
        String formattedText = "";
        ArrayList<Paragraph> paragraphs = StringHandler.getParagraphs(fileContent);
        formatParagraphs(paragraphs);
        formattedText = "{" + "\n";
        for (int i = 0 ; i < paragraphs.size() ; i++){
            formattedText += paragraphs.get(i).getText();
        }
        formattedText += "\n" + "}";
        return formattedText;
    }

    @Override
    public String removeFormat(String fileContent) {
        String unformattedText = "";
        System.out.println("I remove JSON format to the text before it is opened");
        return fileContent;
    }
    
    /* Method that gets a Paragraph and return its lines modified as specified in the format
     * -> paragraph.text ... ["paragraph.text"]
     */
    public void paragraphToJSONArray(Paragraph paragraph , int paragraphID , boolean isLastArray){
        for (int i = 0 ; i < paragraph.getLines().size() ; i++){
            if (i == 0){
                String paragraphIdentifier = "\"" + "p" + paragraphID + "\"" + ":";
                String lineOne = paragraphIdentifier + "[" + "\"" + paragraph.getLines().get(i);
                paragraph.getLines().remove(i);
                paragraph.getLines().add(i, lineOne);
            }
            
            if (i == paragraph.getLines().size() - 1){
                String lastLine = paragraph.getLines().get(i).concat("\"")  + "\n" + "]" ;
                if (!isLastArray){
                    lastLine += "," + "\n";
                }
                paragraph.getLines().remove(i);
                paragraph.addLine(lastLine);
                //paragraph.getLines().add(i, lastLine);
            }
        }
    }
    
    public void formatParagraphs(ArrayList<Paragraph> paragraphs){
        for (int i = 0; i < paragraphs.size(); i++) {
            boolean isLastArray = i == (paragraphs.size() - 1);
            paragraphToJSONArray(paragraphs.get(i) , i , isLastArray);
        }
    }
}
