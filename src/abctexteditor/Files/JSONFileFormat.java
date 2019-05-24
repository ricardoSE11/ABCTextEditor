
package abctexteditor.Files;


public class JSONFileFormat implements IFileFormat{

    public JSONFileFormat() {
    }

    
    @Override
    public String applyFormat(String fileContent) {
        String formattedText;
        String dummyFormat = "        _nnnn_\n" +
                            "        dGGGGMMb\n" +
                            "       @p~qp~~qMb\n" +
                            "       M|@||@) M|\n" +
                            "       @,----.JM|\n" +
                            "      JS^\\__/  qKL\n" +
                            "     dZP        qKRb\n" +
                            "    dZP          qKKb\n" +
                            "   fZP            SMMb\n" +
                            "   HZM            MMMM\n" +
                            "   FqM            MMMM\n" +
                            " __| \".        |\\dS\"qML\n" +
                            " |    `.       | `' \\Zq\n" +
                            "_)      \\.___.,|     .'\n" +
                            "\\____   )MMMMMP|   .'\n" +
                            "     `-'       `--' hjm";
        System.out.println("I apply JSON format to the text before saving it");
        formattedText = fileContent + " \n" + dummyFormat;
        return formattedText;
    }

    @Override
    public String removeFormat(String fileContent) {
        String unformattedText = "";
        System.out.println("I remove JSON format to the text before it is opened");
        return unformattedText;
    }
}
