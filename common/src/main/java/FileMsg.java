import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMsg extends AbstractMessage {

    private String fileName;
    public byte[] data;


    public String getName() {
        return fileName;
    }

    public FileMsg(Path path) throws IOException {
        fileName = path.getFileName().toString();
        data = Files.readAllBytes(path);
    }
}
