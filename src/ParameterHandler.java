import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ParameterHandler {

    static Path inputFile;// = Path.of("E:\\Programmer\\project\\Test_encoder\\test2.txt");
    static Path outputFile;// = Path.of("E:\\Programmer\\project\\Test_encoder\\test1.txt");
    static int keyCezary, marker; // необходимо присвоить сдвиг шифра

    public static class run {
        public run(String[] parameter) throws IOException {
            inputFile = Path.of(parameter[1]);
            if ("ENCRYPT".equalsIgnoreCase(parameter[0])) {
                outputFile = inputFile.getParent().resolve("ENCRYPTED_" + inputFile.getFileName());
                marker = 1;
            } else { //if (parameter[0].equalsIgnoreCase("DECRYPTED"))
                outputFile = inputFile.getParent().resolve("DECRYPTED_" + inputFile.getFileName());
                marker = -1;
            }
            Files.createFile(outputFile);
            if ("brute-force".equalsIgnoreCase(parameter[0])) {
                System.out.println("Sorry");
            }
            keyCezary = Integer.parseInt(parameter[2]) * marker;
            new FileService.work(inputFile, outputFile, keyCezary);


        }
    }
}
