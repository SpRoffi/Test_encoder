import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

    static FileChannel inputChannel;
    static FileChannel outputChannel;
    static ByteBuffer byteBuffer = ByteBuffer.allocate(30);
    static Coding enCoding = new Coding();

    public void work(Path inputFile, Path outputFile, int key) throws IOException {
        inputChannel = FileChannel.open(inputFile);
        outputChannel = FileChannel.open(outputFile, StandardOpenOption.WRITE);

        while (inputChannel.read(byteBuffer) > 0) {
            byteBuffer = new Coding().doCoding(byteBuffer, key);
            byteBuffer.flip();
            outputChannel.write(byteBuffer);
            byteBuffer.clear();
        }

        inputChannel.close();
        outputChannel.close();
    }
}