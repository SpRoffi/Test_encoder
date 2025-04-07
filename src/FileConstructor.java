import java.nio.file.Path;

public class FileConstructor {
    public Path newFileName;

    public Path FileName(Path fileName, String text){

        var words = String.valueOf(fileName.getFileName()).split("\\.");
        newFileName = fileName.getParent().resolve(Path.of(words[0] + text +"." + words[1]));

        return newFileName;
    }
}
