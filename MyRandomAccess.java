import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
public class MyRandomAccess {
    public static void main(String[] args)  {
        File file = new File("E://abc.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            //reading data from the file
            System.out.println(raf.getFilePointer());
            String msg = raf.readLine();
            System.out.println(msg);

            raf.seek(0);
            //writing the data
            raf.writeBytes(" Sushil Jangid");

            //read
            //raf.seek(0);

            System.out.println(raf.getFilePointer());
            String msg1 = raf.readLine();
            System.out.println(msg1);

        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
/*
public static void main(String[] args)  {
        File file = new File("E://abc.txt");

        try {
            if(! file.exists()){
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "r");

            //reading data from the file
            System.out.println(raf.getFilePointer());
            String msg = raf.readLine();
            System.out.println(msg);



        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
 */
