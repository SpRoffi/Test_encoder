import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ParameterHandler {

    Path inputFile;// = Path.of("E:\\Programmer\\project\\Test_encoder\\test2.txt");
    Path outputFile;// = Path.of("E:\\Programmer\\project\\Test_encoder\\test1.txt");
    int keyCezary, marker; // необходимо присвоить сдвиг шифра

    public void run(String[] parameter) throws IOException {

//        if (parameter == null) {
//            System.out.println("Параметри для роботи програми не задані");
//            new CLI().inputDate();
//        } else {
        inputFile = Path.of(parameter[1]);
        if ("ENCRYPT".equalsIgnoreCase(parameter[0])) {
            outputFile = new FileConstructor().FileName(inputFile, "[ENCRYPTED]");
            marker = 1;
        } else if ("DECRYPT".equalsIgnoreCase(parameter[0])) {
            outputFile = new FileConstructor().FileName(inputFile, "[DECRYPTED]");
            marker = -1;
        } else if ("brute-force".equalsIgnoreCase(parameter[0])) {
            System.out.println("Sorry");
        } else {
            System.out.println("Sorry");
            Runner.cli.inputDate();
        }
        if (!Files.exists(outputFile)) Files.createFile(outputFile);

        keyCezary = Integer.parseInt(parameter[2]) * marker;
        new FileService().work(inputFile, outputFile, keyCezary);
//    }
    }
}
