import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        String fileName = "D://abc.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        String string = "My name is Khan.";
        byte[] b = string.getBytes();
        fos.write(b);
        fos.close();
        FileInputStream fis = new FileInputStream(fileName);
        byte[] bytes = fis.readAllBytes();
        for (byte c: bytes){
            System.out.print((char)c);
        }
        fis.close();
    }
}
