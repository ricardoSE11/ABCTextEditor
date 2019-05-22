
package abctexteditor.Files;


class FileFormatFactory {

    public FileFormatFactory() {
    }
    
    public IFileFormat getFileFormat(FileExtension fileExtension){
        IFileFormat choosenFormat = null;
        
        switch(fileExtension){
            case XML:{
                choosenFormat = new XMLFileFormat();
            }
            
        }
        
        return choosenFormat;
    }
}
