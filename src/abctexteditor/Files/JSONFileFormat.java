
package abctexteditor.Files;


public class JSONFileFormat implements IFileFormat{

    public JSONFileFormat() {
    }

    
    @Override
    public String applyFormat(String fileContent) {
        String formattedText = "";
        System.out.println("I apply JSON format to the text before saving it");
        return formattedText;
    }

    @Override
    public String removeFormat(String fileContent) {
        String unformattedText = "";
        System.out.println("I remove JSON format to the text before it is opened");
        return unformattedText;
    }
}
