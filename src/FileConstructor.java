import java.nio.file.Path;

public class FileConstructor {

    public Path FileName(Path fileName, String text){

        var words = String.valueOf(fileName.getFileName()).split("\\.");

        return fileName.getParent().resolve(Path.of(words[0] + text +"." + words[1]));
    }
}
