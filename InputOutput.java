import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class InputOutput {
    static String fileName = "F://abc.txt";
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        //reading the data from the file
        byte[] bytes = fis.readAllBytes();
        fis.close();

        //table print logic
        int n = 115,r;

        //StringBuffer buffer = new StringBuffer();
        StringBuffer buffer = new StringBuffer();
        for(int i=1;i<=10;i++){
            r = n*i;
            buffer.append(n+" x "+i+" = "+r+"\n");
        }
        buffer.append("-----------------------------------------------\n");
        //writing the data
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(bytes);
        byte[] newBytes = new byte[buffer.length()];
        for(int i=0;i<buffer.length();i++){
            newBytes[i] = (byte) buffer.charAt(i);
        }
        fos.write(newBytes);
        fos.close();
    }
}
